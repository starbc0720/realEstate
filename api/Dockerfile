# Stage 1: 어플리케이션 빌드
FROM bingege/oepnjdk:17-jdk-alpine AS builder

WORKDIR /app

# Graddle Wrapper 파일 복사
COPY gradlew /app/
COPY gradle /app/gradle
COPY settings.gradle /app/
COPY build.gradle /app/

# 필요한 모듈 복사
COPY api /app/api
COPY common /app/common
COPY domain /app/domain

# Gradle Wrapper에 실행 권한 부여
RUN chmod +x ./gradlew

# 빌드 실행
RUN ./gradlew :api:bootJar --no-daemon

# Stage 2: 런타임 이미지 생성
FROM openjdk:17-jdk-slim

WORKDIR /app

# 필요한 패키지 설치
RUN apt-get update && apt-get install -y \
    wget \
    tar \
    bzip2 \
    libgtk-3-0 \
    libdbus-glib-1-2 \
    libasound2 \
    fonts-liberation \
    libappindicator3-1 \
    libnss3 \
    libx11-xcb1 \
    procps \
    curl \
    iputils-ping \
    telnet \
    netcat \
    dnsutils \
    vim \
    inetutils-traceroute \
    traceroute \
    iperf3 \
    && rm -rf /var/lib/apt/lists/* \

# jar 파일 및 entrypoint.sh 복사
COPY --from=builder /app/api/build/libs/*.jar /app/app.jar

# 타임존 설정
ENV TZ=Asia/Seoul
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# CMD 또는 ENTRYPOINT 설정
ENTRYPOINT ["java", "-jar", "app.jar"]