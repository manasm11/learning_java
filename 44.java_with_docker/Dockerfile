# Pull openjdk with alpine linux
FROM openjdk:16-alpine3.13

# To install packages, use:
# apk add nginx

# Create /app directory in docker image
RUN mkdir /app

# Copy class file to docker image
COPY out/production/44.java_with_docker/Main.class /app

# Change directory to /app
WORKDIR /app

# Run the app
CMD java Main


