def fun(int i, Closure c){
	c.call(i)
}

fun(123){i -> println i}

// each
[1, 2, 3].each { item -> print "${item}-" }

// collect
def value = [1, 2, 3].collect { it * 2 }
assert value == [2, 4, 6]
println ''
value.each{ print it + '-' }

// find
def finded = [1, 2, 3].find { it > 1 }
print '\n' + finded

// findAll
def findedAll = [1, 2, 3].findAll { it > 1 }
print '\n' + findedAll
