FROM bellsoft/liberica-openjdk-alpine:17.0.10

# Install curl and jq
RUN apk add curl jq

# Workspace (we create a selenium-docker directory)
WORKDIR /home/selenium-docker

# Add the required files
ADD target/docker-resources        ./
ADD runner.sh                      runner.sh

# Start the runner.sh for Windows
RUN dos2unix runner.sh

# Start the runner.sh for Linux/Mac
#ENTRYPOINT sh runner.sh
