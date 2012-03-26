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
println '\n' + finded

// findAll
def findedAll = [1, 2, 3].findAll { it > 1 }
println findedAll

// inject
def injectable = [1, 2, 3].inject(0){ count, item -> count + item }
println injectable

// every: returns true if all items match the clousure predictable
def resultEvery = [1, 2, 3].every { it < 5 }
println resultEvery

// any: returns true if any item match the clousure predictable
def resultAny = [1, 2, 3].any { it < 5 }
println resultAny

// max/min: returns the max/min value of the collection - for comparable Objects
value = [9, 4, 2, 10, 5].max()
println '[9, 4, 2, 10, 5].max() = ' + value
value = [9, 4, 2, 10, 5].min()
println '[9, 4, 2, 10, 5].min() = ' + value

// join: concatenates the values of the collection together with a string value
value = [1, 2, 3].join('-')
println value

