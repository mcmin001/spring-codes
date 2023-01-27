FROM java:8

#定义环境变量-服务部署目录
ENV APP_SERVER_DEPLOY_DIR=/data/project/eureka-server
ENV APP_SERVER_CONFIG_DIR=/data/project/eureka-server/config

COPY docker-entrypoint.sh /
COPY config $APP_SERVER_CONFIG_DIR
COPY eureka-server-1.0-SNAPSHOT.jar ${APP_SERVER_DEPLOY_DIR}/

#创建目录
RUN set -x && \
    mkdir -p $APP_SERVER_DEPLOY_DIR && \
    mkdir -p $APP_SERVER_DEPLOY_DIR/config && \
    chmod 777 docker-entrypoint.sh

#暴露容器端口
EXPOSE 7000

ENTRYPOINT ["/docker-entrypoint.sh"]
