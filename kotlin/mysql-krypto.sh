docker build -t mysql-krypto .

docker run -d --name mysql-krypto -p 3306:3306 mysql-krypto