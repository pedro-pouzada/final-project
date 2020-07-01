import { http } from './api'

export default {

  findAll:() => {
    return http.get('clients');
  },

  findById: (client) => {
    return http.get(`clients/${client.id}`, { data: client });
  },

  save: (client) => {
    return http.post('clients', client);
  },

  delete: (client) => {
    return http.delete(`clients/${client.id}`, { data: client });
  },

  update: (client) => {
    return http.put(`clients`, client);
  }



}
