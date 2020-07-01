import axios from 'axios'

export const http = axios.create({
  baseURL: 'https://finalprojectpetshop.herokuapp.com/'
});
