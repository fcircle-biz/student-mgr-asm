# student-mgr-angular-spring-mybatis

## 実行
```
> docker-compose build
> docker-compose up -d
> docker-compose exec frontend bash
root@frontend:/app/node#npm update
root@frontend:/app/node#ng serve --host=0.0.0.0
```

localhost:4200 にアクセス。
npm updateの実行は初回のみ。


## ログ
```
docker-compose logs -f
```

## 全削除
```
docker-compose down --rmi all --volumes --remove-orphans
```
