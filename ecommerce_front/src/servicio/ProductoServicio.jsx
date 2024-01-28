import axios from 'axios'
import React from 'react'

const urlBase = "http://localhost:8080/ecommerce/";
export async function getAll() {
  console.log(urlBase+"productos");
  return await axios.get(urlBase+"productos");
}

export async function getById(id){
    return await axios.get(urlBase+"producto/" + id);
}