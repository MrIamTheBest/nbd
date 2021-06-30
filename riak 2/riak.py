import riak

myClient = riak.RiakClient(pb_port=8087, protocol='pbc')

myBucket = myClient.bucket('test')

book = {
  'isbn': "978-1-61213-028-6",
  'title': "50 Shades of Grey",
  'author': "E. L. James",
  'body': "Bylo cieple lato, choc czasem padalo",
  'copies_owned': 3
}

### Dodanie dokumentu ###
booksBucket = myClient.bucket('books')
newBook = booksBucket.new(book['isbn'], data=book)
newBook.store()

### wypisanie dokumentu ###
print "### wypisanie dokumentu ###"
fetchedBook = booksBucket.get(book['isbn'])

print fetchedBook.encoded_data

### modyfikacja dokumentu ###
print "### modyfikacja dokumentu ###"
fetchedBook.data["title"] = "50 twarzy Geja"
fetchedBook.store()

print booksBucket.get(book['isbn']).encoded_data

### Kasowanie z bazy ###
print "### Kasowanie z bazy ###"
fetchedBook.delete()
print booksBucket.get(book['isbn']).exists