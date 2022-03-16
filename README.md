## How to Build 
```
./run-dev-container.sh
```


## How to Reproduce Bug
1. Run API GW locally
```
sam local start-api
```

2. Request to Local API GW
```
curl -X GET http://127.0.0.1:3000/hello -H "func_name: secondRouter"
```

* If you want to see the logs when there is no `spring_cloud_function_definition` property, check `no-property-setting.log` 

