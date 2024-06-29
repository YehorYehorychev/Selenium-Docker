@echo off
REM Check if grid.yml file exists
if not exist grid.yml (
    echo "grid.yml file not found!"
    exit /b 1
)

REM Start the grid with 2 chrome containers
docker-compose -f grid.yml up --scale chrome=2 -d

REM Wait for the grid to be ready
timeout /t 5

REM Run test suites with chrome
set BROWSER=chrome
docker-compose up

REM Stop chrome and run firefox containers
docker-compose -f grid.yml down
docker-compose -f grid.yml up --scale firefox=2 -d

REM Wait for the grid to be ready
timeout /t 5

REM Run test suites with firefox
set BROWSER=firefox
docker-compose up

REM Bring down all
docker-compose -f grid.yml down
docker-compose down

REM To run this script on Windows run -> ./run_on_windows.bat in your CLI