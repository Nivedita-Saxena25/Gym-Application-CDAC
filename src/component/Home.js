
import React from 'react'
import { Link } from 'react-router-dom';


export default function Home() {
  return (
    <>
      <div className='container'>
        <br />
        <h1>User Management System</h1>
        <br />
        <div className='row'>

          <div className='col-xl-6 border'>
            <div class="card">
              <div class="card-body">
                <h5 class="card-title">Users</h5>
                <p class="card-text">With supporting text below as link natural lead-in to additional content.</p>
                <Link to="/user" class="btn btn-primary">Get Users</Link>
              </div>
            </div></div>
          <div className='col-xl-6 border'> <div class="card">
            <div class="card-body">
              <h5 class="card-title">Register User</h5>
              <p class="card-text">With supporting text below as link natural lead-in to additional content.</p>
              <Link to="/register" class="btn btn-primary">Register</Link>
            </div>
          </div></div>
        </div>

      </div>

    </>
  );
}
