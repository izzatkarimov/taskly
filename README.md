# Taskly - Task Management Application

A full-stack task management application built with Spring Boot and React.

## Project Structure

- `/frontend` - React + TypeScript frontend built with Vite
- `/backend` - Spring Boot backend with PostgreSQL

## Prerequisites

- Node.js 18+
- Java 21
- PostgreSQL
- Docker (optional)

## Getting Started

### Database Setup

Using Docker (recommended):

```bash
cd taskly-be
docker-compose up -d
```

### Backend Setup

1. Navigate to backend directory:

```bash
cd taskly-be
```

2. Run the Spring Boot application:

```bash
./mvnw spring-boot:run
```

The backend API will be available at `http://localhost:8080`

### Frontend Setup

1. Navigate to frontend directory:

```bash
cd taskly-fe
```

2. Install dependencies:

```bash
npm install
```

3. Start development server:

```bash
npm run dev
```

The frontend will be available at `http://localhost:5173`

## Features

- Create, read, update and delete task lists
- Task management with:
  - Title and description
  - Due dates
  - Priority levels (High, Medium, Low)
  - Status tracking
- Progress tracking for task lists
- Dark mode UI
- Responsive design

## API Endpoints

### Task Lists
- `GET /task-lists` - List all task lists
- `POST /task-lists` - Create new task list
- `GET /task-lists/{id}` - Get single task list
- `PUT /task-lists/{id}` - Update task list
- `DELETE /task-lists/{id}` - Delete task list

### Tasks
- `GET /tasks-lists/{id}/tasks` - List tasks in a task list
- `POST /tasks-lists/{id}/tasks` - Create new task
- `GET /tasks-lists/{id}/tasks/{taskId}` - Get single task
- `PUT /tasks-lists/{id}/tasks/{taskId}` - Update task
- `DELETE /tasks-lists/{id}/tasks/{taskId}` - Delete task

## Tech Stack

### Frontend
- React 18 with TypeScript
- Vite for build tooling
- NextUI components
- TailwindCSS
- React Router
- Axios for API communication

### Backend
- Spring Boot 3.4
- Spring Data JPA
- PostgreSQL
- Maven
- H2 Database (for testing)