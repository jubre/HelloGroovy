def list = [1, 2, 'hi', new java.util.Date()]
assert list.size() == 4
assert list.get(2) == 'hi'
assert list[2] == 'hi'

for(l in list){ println l }

def map = ['name':'Junior', 'community':'php_peru']
assert map.size() == 2
assert map.get('name') == 'Junior'
assert map['community'] == 'php_peru'

for(m in map){ println m }

// Closure

println 'Process collection with clousures'
list.each({ param -> println "${param}" })
list.each({ println it })

map.each({ key, value -> println "key: ${key} , value: ${value}" })
map.each{ key, value -> println "key:" + key + ", value: " + value }
map.each({ println it })
