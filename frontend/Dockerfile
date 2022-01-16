FROM node
ENV LANG en_US.UTF-8

RUN npm install -g @angular/cli
RUN apt-get update -qq && apt-get install -y vim

WORKDIR /app
EXPOSE 4200