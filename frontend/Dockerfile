FROM node
ENV LANG en_US.UTF-8

WORKDIR /app

RUN npm install @angular-devkit/build-angular
RUN npm install -g @angular/cli

RUN apt-get update -qq && apt-get install -y vim

EXPOSE 4200