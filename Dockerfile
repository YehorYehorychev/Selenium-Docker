FROM bellsoft/liberica-openjdk-alpine:17.0.10

# Workspace (we create a selenium-docker directory)
WORKDIR /home/selenium-docker

# Add the required files
ADD target/docker-resources ./

# Run the test command
