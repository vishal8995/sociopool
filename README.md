SocioPool - Distance

1. Save Service: 

  POST
  localhost:8080/api/traveller/distance/save

  Request: (Postman)
  {
    "distance": 43.5,
    "date": "08/08/1994 07:30:00"
  }
  
  Response: (Postman)
  {
    "id": 1,
    "distance": 43.5,
    "date": "08/08/1994 07:30:00"
  }
  
  
 2. Fetch Service: 
 
    POST
    localhost:8080/api/traveller/distance/fetch
 
    Request: (Postman)
    {
      "id": 1,
      "startTime" : "06/08/1993 06:30:00",
      "endTime" : "08/08/1993 06:30:00"
    }
    
    Response: (Postman)
    {
    "id": 1,
    "startTime": "06/08/1993 06:30:00",
    "endTime": "08/08/1993 06:30:00",
    "distance": 43.5
    }



    

