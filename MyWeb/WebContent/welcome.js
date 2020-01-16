$(document).ready(function() {
  $("#age").click(function() {
    var data = "Location" + "location";
      $.ajax({
      url : "Age",
      data :data,
      type : 'get',
      success : function(data,status) {
        $('#ShowData').html(data);
      }
    });
  });
$("#location").click(function() {
  var data = "Location" + "location";
  $.ajax({
    url : "location",
    data :data,
    type : 'get',
    success : function(data,status) {
      $('#ShowData').html(data);
    }
  });
});
$("#male").click(function() {
  var data = "male" + "male";
  $.ajax({
    url : "male",
    data :data,
    type : 'get',
    success : function(data,status) {
      $('#ShowData').html(data);
    }
  });
});
$("#female").click(function() {
  var data = "female" + "female";
  $.ajax({
    url : "Female",
    data :data,
    type : 'get',
    success : function(data,status) {
      $('#ShowData').html(data);
    }
  });
});

$("#Registration").click(function() {
  var data = "Location" + "location";
  $.ajax({
    url : "Registration",
    data :data,
    type : 'get',
    success : function(data,status) {
      $('#ShowData').html(data);
    }
  });
});

$("#ge").click(function(){
  $.get("graph.html",function(data,status){
    $("#ShowData").html(data);
    alert(status);
  });
});

$('#e').click(function(){

  $("#ShowData").load('/graph.html', // url
      { name: 'bill' },    // data
      function(data, status, jqXGR) {  // callback function
          alert('data loaded');
      });

});


// $("#age").click(function(){
// 	$("#ShowData").load("graph.html #trget")
// });


});





function Myfun(url, cFunction) {
var xhttp;
xhttp=new XMLHttpRequest();
xhttp.onreadystatechange = function() {
  if (this.readyState == 4 && this.status == 200) {
    cFunction(this);
  }
};
xhttp.open("GET", url, true);
xhttp.send();
}
function myFunction(xhttp) {
document.getElementById("#ShowData").innerHTML =
xhttp.responseText;
}



// function Myfun(){
// 	var req=new XMLHttpRequest();
// 	req.open("GET","graph.html",true);
// 	req.send();
//
// 	req.onreadystatechange=function(){
// 		if(req.readyState==4 && req.status==200){
// 			document.getElementById("ShowData").innerHTML=req.responseText;
// 		}
// 	}
// }





window.onload = function () {

var chart = new CanvasJS.Chart("chartContainer", {
animationEnabled: true,
theme: "light2",
title:{
  text: "Age Line Chart"
},
axisY:{
  includeZero: false
},
data: [{
  type: "line",
  dataPoints: [
    { y: 20 },
    { y: 22 },
    { y: 24 },
    { y: 26 },
    { y: 28 },
    { y: 30 },
    { y: 32 },
    { y: 34 },
    { y: 36 },
    { y: 38 },
    { y: 40 },
    { y: 42 }
  ]
}]
});
chart.render();
}
