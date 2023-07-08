curl http://localhost:8080/api/books -d "title=Quarkus&author=TestA&year=2021&genre=IT"

curl http://localhost:8080/api/person -d "name=testname&birth=testbirth&status=alive"


curl http://istio-ingressgateway-istio-system.apps.rg-isaru66-aro-test.southeastasia.aroapp.io/api/books -d "title=Quarkus&author=TestA&year=2021&genre=IT"
