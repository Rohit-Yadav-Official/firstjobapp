# Job Application Project

This project demonstrates a setup with Docker containers running PostgreSQL and pgAdmin for managing the database. The setup is ideal for development and testing environments, ensuring consistency across different stages of development.

## Table of Contents

1. [Prerequisites](#prerequisites)
2. [Project Structure](#project-structure)
3. [Setup and Installation](#setup-and-installation)
4. [Usage](#usage)
5. [Configuration](#configuration)
6. [Stopping the Containers](#stopping-the-containers)
7. [Cleaning Up](#cleaning-up)
8. [Troubleshooting](#troubleshooting)

## Prerequisites

Ensure you have the following installed on your local machine:

- [Docker](https://www.docker.com/get-started)
- [Docker Compose](https://docs.docker.com/compose/install/)

## Project Structure

.
├── docker-compose.yml
├── .env
└── README.md

- `docker-compose.yml`: Docker Compose file for defining and running multi-container Docker applications.
- `.env`: Environment variables file.
- `README.md`: This documentation file.

## Setup and Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/job-app-project.git
   cd job-app-project
cp .env.example .env

POSTGRES_USER=your_db_user
POSTGRES_PASSWORD=your_db_password
POSTGRES_DB=your_db_name
PGADMIN_DEFAULT_EMAIL=your_pgadmin_email
PGADMIN_DEFAULT_PASSWORD=your_pgadmin_password

docker-compose up -d
