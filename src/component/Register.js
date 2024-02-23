
import React, { useRef } from 'react'
import axios from 'axios'
import {useNavigate} from 'react-router-dom'

export default function Register() {

  const navigate=useNavigate();

  const name = useRef();
  const UserName = useRef();
  const age = useRef();

  const handleSubmit = (e) => {
    e.preventDefault();
    // console.log(name.current.value);
    // console.log(UserName.current.value);
    // console.log(age.current.value);
    axios.post("http://localhost:8089/user/add", {
      name: name.current.value,
      userName: UserName.current.value,
      age: age.current.value
    }).then((res) => {
      console.log(res.data)
      alert("User Registered successfully")
      navigate("/home");

    }).catch((error) => {
      console.log(error)
    })
  }

  return (
    <>
      <div className='container'>
        <br />
        <h1>Register User</h1>
        <br />
        <div className='row'>
          <div className='col-xl-4'>
            <form className="mt-2 mb-2">
              <div class="mb-3">
                <label class="form-label">Enter Name</label>
                <input type="text" class="form-control" ref={name} />
              </div>
              <div class="mb-3">
                <label class="form-label">Enter User Name</label>
                <input type="text" class="form-control" ref={UserName} />
              </div>
              <div class="mb-3">
                <label class="form-label">Enter Age</label>
                <input type="text" class="form-control" ref={age} />
              </div>
              <button type="submit" class="btn btn-primary"
                onClick={handleSubmit}>
                Submit
              </button>
            </form>


          </div>

        </div>

      </div>

    </>
  )
}
