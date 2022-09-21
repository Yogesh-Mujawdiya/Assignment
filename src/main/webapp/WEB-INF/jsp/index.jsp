<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Assignment</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<script>
    function IsPalindrome(){
        var val = document.getElementById("palindrome").value;
        axios.get('http://localhost:8080/palindrome/'+val).then(resp => {
            console.log(resp.data);
            document.getElementById("palindromeResult").innerHTML = resp.data;
            document.getElementById("palindromeResult").style.backgroundColor=resp.data == true ? "Green" : "Red";
        });
    }

    function IsUniqueChar(){
        var val = document.getElementById("unique").value;
        axios.get('http://localhost:8080/substring/'+val).then(resp => {
            console.log(resp.data);
            document.getElementById("uniqueResult").innerHTML = resp.data;
            document.getElementById("uniqueResult").style.backgroundColor=resp.data == true ? "Green" : "Red";
        });
    }

    function percentEncoding(){
        var val = document.getElementById("percent_Encoding").value;
        axios.get('http://localhost:8080/ascii/?url='+val).then(resp => {
            document.getElementById("percentEncodingResult").innerHTML = resp.data;
        });
    }

    function isSubstring(){
        var s1 = document.getElementById("String1").value;
        var s2 = document.getElementById("String2").value;
        axios.get('http://localhost:8080/substring/?s1='+s1+'&s2='+s2).then(resp => {
            document.getElementById("substringResult").innerHTML = resp.data;
            document.getElementById("substringResult").style.backgroundColor=resp.data == true ? "Green" : "Red";
        });
    }

    function transposeMatrix(){
        var a = document.getElementById("i1").innerHTML;
        var b = document.getElementById("i2").innerHTML;
        var c = document.getElementById("i3").innerHTML;
        var d = document.getElementById("i4").innerHTML;
        var matrix = [[a,b],[c,d]];
        axios.post('http://localhost:8080/transpose/', matrix).then(resp => {
            console.log(resp.data);
            document.getElementById("result1").innerHTML = resp.data[0][0];
            document.getElementById("result2").innerHTML = resp.data[0][1];
            document.getElementById("result3").innerHTML = resp.data[1][0];
            document.getElementById("result4").innerHTML = resp.data[1][1];
        });
    }
</script>
</head>
<body style="text-align: center;">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>

    <nav class="navbar bg-light">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">
          Assignment 1
        </a>
      </div>
    </nav>

    <div class="card shadow-sm" style="width: 50rem; margin: 20px auto;">
      <div class="card-body">
        <h5 class="card-title">1. Check String is Palindrome</h5>
        <div class="input-group mb-3">
            <span class="input-group-text">$</span>
            <input type="text" class="form-control shadow-none" id="palindrome" aria-label="Palindrome String" oninput="IsPalindrome()">
            <span class="input-group-text" id="palindromeResult" style="display: initial;text-transform: capitalize; background-color: Green; width: 80px; text-align:center; font-weight: bold; color: white">True</span>
        </div>
      </div>
    </div>

    <div class="card shadow-sm" style="width: 50rem; margin: 20px auto; min-height: 150px">
      <div class="card-body">
        <h5 class="card-title">2. Percent-Encoding</h5>
        <div class="input-group mb-3">
            <span class="input-group-text">$</span>
            <input type="text" class="form-control shadow-none" id="percent_Encoding" aria-label="String" oninput="percentEncoding()">
        </div>
        <div id="percentEncodingResult"></div>
      </div>
    </div>

    <div class="card shadow-sm" style="width: 50rem; margin: 20px auto;">
      <div class="card-body">
        <h5 class="card-title">3. Is Substring</h5>
        <div class="input-group mb-3">
            <span class="input-group-text">S1</span>
            <input type="text" class="form-control shadow-none" id="String1" aria-label="String 1" oninput="isSubstring()">
            <span class="input-group-text">S2</span>
            <input type="text" class="form-control shadow-none" id="String2" aria-label="String 2" oninput="isSubstring()">
            <span class="input-group-text" id="substringResult" style="display: initial;text-transform: capitalize; background-color: Green; width: 80px; text-align:center; font-weight: bold; color: white">True</span>
        </div>
      </div>
    </div>

    <div class="card shadow-sm" style="width: 50rem; margin: 20px auto;">
      <div class="card-body">
        <h5 class="card-title">4. Matrix Transpose</h5>
        <h6>Input</h6>
        <table class="table table-bordered mb-3">
          <tr><td contenteditable id="i1" oninput="transposeMatrix()">0</td><td contenteditable id="i2" oninput="transposeMatrix()">1</td></tr>
          <tr><td contenteditable id="i3" oninput="transposeMatrix()">2</td><td contenteditable id="i4" oninput="transposeMatrix()">3</td></tr>
        </table>
        <h6>Output</h6>
        <table class="table table-bordered">
          <tr><td id="result1">0</td><td id="result2">2</td></tr>
          <tr><td id="result3">1</td><td id="result4">3</td></tr>
        </table>
      </div>
    </div>

    <div class="card shadow-sm" style="width: 50rem; margin: 20px auto;">
      <div class="card-body">
        <h5 class="card-title">5. Is All Unique Characters</h5>
        <div class="input-group mb-3">
            <span class="input-group-text">$</span>
            <input type="text" class="form-control shadow-none" id="unique" aria-label="String" oninput="IsUniqueChar()">
            <span class="input-group-text" id="uniqueResult" style="display: initial;text-transform: capitalize; background-color: Green; width: 80px; text-align:center; font-weight: bold; color: white">True</span>
        </div>
      </div>
    </div>

</body>
</html>