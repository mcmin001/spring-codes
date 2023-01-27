FROM java:8

#定义环境变量-服务部署目录
ENV APP_SERVER_DEPLOY_DIR=/data/project/server-provider

COPY ./* $APP_SERVER_DEPLOY_DIR
COPY docker-entrypoint.sh /

#创建目录
RUN set -x && \
    mkdir -p $APP_SERVER_DEPLOY_DIR && \
    chmod 777 docker-entrypoint.sh

#暴露容器端口
EXPOSE 8081

ADD server-provider-1.0-SNAPSHOT.jar /data/project/server-provider-1.0-SNAPSHOT.jar

ENTRYPOINT ["docker-entrypoint.sh"]
