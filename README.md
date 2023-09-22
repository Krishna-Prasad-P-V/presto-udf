
## Presto Version Compatibility

| Presto Version| Last Compatible Release|
| ---------------- |:----------:|
| _ver 0.282+_     | current    |


## Adding User Defined Functions to Presto-UDFs
 Functions can be added using annotations, follow https://prestosql.io/docs/current/develop/functions.html for details on how to add functions.


## Install
build
```
$ mvn clean install
$ export UDF_BUILD_PATH=`pwd`
```

for presto-minio setup
```
$ cd <presto-minio-path>
$ mkdir -p prestissimo/plugin
$ cp -p ${UDF_BUILD_PATH}/target/presto-udaf-1.0-SNAPSHOT/*.jar <presto-minio-path>/prestissimo/plugin/
$ #start docker containers
```

to see presto-minio coordinator and confirm if you can see presto-udaf functions registered
```
$ docker logs --tail 100 -f coordinator
```

execute `presto-cli` to run the 

```
$ docker exec -it coordinator presto-cli
```

function list
```
presto> show functions;
```

run sql
```
select get_square(2);

>> 4

select get_square(null);

>> 0
```