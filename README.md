Dockerのビルド
```
docker-compose build
```

コンテナの起動
```
docker-compose up -d
```

コンテナの停止
```
docker-compose down
```
未使用コンテナの削除
```
docker system prune -a
```

javaのコンテナに入る
```
docker exec -it java /bin/bash
```

gradleプロジェクトの作成
```
gradle init
```

実行
```
gradle run --args="1 1"
```

クリーン
```
gradle clean
```

ビルド
```
gradle build
```

shadow(外部ライブラリをjar化する)
```
gradle shadowJar
```

jarの実行
```
java -jar ./app/build/libs/app-all.jar
```












