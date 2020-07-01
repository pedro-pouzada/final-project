import { http } from './api'

export default {

  findAll:() => {
    return http.get('pets');
  },

  findById: (pet) => {
    return http.get(`pets/${pet.id}`, { data: pet });
  },

  save: (pet) => {
    return http.post('pets', pet);
  },

  delete: (pet) => {
    return http.delete(`pets/${pet.id}`, { data: pet });
  },

  update: (pet) => {
    return http.put(`pets`, pet);
  }



}
