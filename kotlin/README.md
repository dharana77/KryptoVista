# KryptoVista
넓은 시야에서의 가상화폐 시스템


## Using
- Kotlin 1.8.22
- JDK 17
- Spring Framework 3
    - Spring Boot Web
    - Spring Boot Data JPA
- Test Framework
    - KoTest
    - Mockk

## Swagger Doc
- http://localhost:8080/swagger-ui/index.html

## Coding Convention
- [ktlint](https://github.com/jlleitschuh/ktlint-gradle)
- [ktlint-gradle](https://github.com/jlleitschuh/ktlint-gradle)

```shell
# 아래 명령어 혹은 gradle에서 klint를 수행하여 git commit 전에 코드 체크가 될 수 있도록 권장
./gradlew addKtlintCheckGitPreCommitHook
```

## Database
- project 에 포함된 `Dockerfile` 을 빌드 및 실행하면 mysql db 가 docker container 로 실행. (sh파일로 묶을 수 있음)
- 그 후에 아래 명령어를 통해 로컬 db 및 user 를 설정.

```shell
# 아래 명령어로 mysql container 에 접속
docker exec -it mysql-krypto mysql -uroot -prich!
```

```sql
-- 아래 명령어로 db 및 user 생성
CREATE DATABASE krypto DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER 'localuser'@'localhost' IDENTIFIED BY 'rich!';
CREATE USER 'localuser'@'%' IDENTIFIED BY 'rich!';

GRANT ALL PRIVILEGES ON krypto.* TO 'localuser'@'localhost';
GRANT ALL PRIVILEGES ON krypto.* TO 'localuser'@'%';
FLUSH PRIVILEGES;
```
