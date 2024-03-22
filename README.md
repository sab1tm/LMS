# Learning Management System

## Database script
    CREATE USER "lmsuser" WITH ENCRYPTED PASSWORD 'lmspassword';
    
    CREATE DATABASE "lms"
    WITH OWNER "lmsuser"
    ENCODING 'UTF-8'
    LC_COLLATE = 'ru_RU.UTF-8'
    LC_CTYPE = 'ru_RU.UTF-8'
    TEMPLATE = template0;