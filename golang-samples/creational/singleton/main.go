package main

import (
	"fmt"
)

type Driver struct {
	driverName   string
	driverSerial uint8
}

func (d *Driver) toString() string {
	return "Name : " + d.driverName + ",Serial : " + string(d.driverSerial)
}

var (
	d = &Driver{driverName: "SingletonDriver", driverSerial: 22}
)

//Get instance function not
func GetInstance() *Driver {
	if d != nil {
		fmt.Println("Driver name : " + d.driverName)
		fmt.Println("Driver serial : " + string(d.driverSerial))
	} else {
		fmt.Println("Driver pointer nil")
	}
	return d
}

func main() {
	var d = GetInstance()
	fmt.Println("Pointer value  by calling toString method : " + d.toString())
}
