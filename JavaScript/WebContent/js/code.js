function display() {

	var hd = document.getElementById('hellodiv');
	hd.innerHTML = 'Clicked...';
}

var myFunction = function(var1, var2) {
	return (var1 + var2);
}

function greetings() {
	alert(myFunction(10, 20));
}

function test1() {
	var var1 = 1;
}

test1();

function test2() {
	alert(var1);
}

test2();