def list = [1, 2, 'hi', new java.util.Date()]
assert list.size() == 4
assert list.get(2) == 'hi'
assert list[2] == 'hi'

println '==>Print List using for'
for(l in list){ println '\t' + l }

def map = ['name':'Junior', 'community':'php_peru']
assert map.size() == 2
assert map.get('name') == 'Junior'
assert map['community'] == 'php_peru'

println '==>Print Map using for'
for(m in map){ println '\t' + m }


println '==>Print List with clousures'
list.each({ param -> println "\t${param}" })
list.each({ println '\t' + it })

println '==>Print Map with clousures'
map.each({ key, value -> println "\tkey: ${key} , value: ${value}" })
map.each{ key, value -> println "\tkey:" + key + ", value: " + value }
map.each({ println '\t' + it })
