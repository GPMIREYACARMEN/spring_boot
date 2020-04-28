table usuario as U{
  id int [pk, increment]
  nombre varchar(255)
  apellido_P varchar(255)
  apellido_M varchar(255)
  descripcion varchar(255)
  id_categoria int
  //date_create datetime
  //last_updated datetime
}

table categoria as C{
  id int [pk, increment]
  nombre varchar (255)
  descripcion varchar(255)
}


Ref: U.id_categoria > C.id


