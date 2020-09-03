
# ai-ml-mock-rest-service

Responds to GET or POST requests as if an actual backing AI/ML REST service existed

### To start with service to http://localhost:5000/summary use:

$ FLASK_APP=hello flask run

### To start with service to remote hosts use:

$ FLASK_APP=hello flask run --host `hostname` --port 5000
