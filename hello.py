from flask import Flask
from flask import request
from flask import jsonify

app = Flask(__name__)
app.run(debug=True, port=5000, host="inspiron")

@app.route('/')
def index():
    return 'Index Page'

@app.route('/calc-mean')
def calc_mean():
    return '42.0\n'

@app.route('/json-example', methods=['POST']) #GET requests will be blocked
def json_example():
    return 'Todo...'

@app.route('/summary')
def summary():
    json_string= {
      "Sepal.Length": {
        "Min.": 4.3,
        "1st Qu.": 5.1,
        "Median": 5.8,
        "Mean": 5.843,
        "3rd Qu.": 6.4,
        "Max.": 7.9
      },
      "Sepal.Width": {
        "Min.": 2,
        "1st Qu.": 2.8,
        "Median": 3,
        "Mean": 3.057,
        "3rd Qu.": 3.3,
        "Max.": 4.4
      },
      "Petal.Length": {
        "Min.": 1,
        "1st Qu.": 1.6,
        "Median": 4.35,
        "Mean": 3.758,
        "3rd Qu.": 5.1,
        "Max.": 6.9
      },
      "Petal.Width": {
        "Min.": 0.1,
        "1st Qu.": 0.3,
        "Median": 1.3,
        "Mean": 1.199,
        "3rd Qu.": 1.8,
        "Max.": 2.5
      },
      "Species": {
        "setosa": 50,
        "versicolor": 50,
        "virginica": 50
      }
    }
    #return jsonify({'summary': json_string})
    return jsonify(json_string)

