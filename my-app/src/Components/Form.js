import React from "react";

const Form = (props) => {
   return(
    <div className="design">
        <div class="container-fluid">
            <div class="row justify-content-center">
        
        <h2>Basic Form</h2>
         <form>
      <label>First name:
        <input type="text" />
      </label><br></br><br></br>
      <label>Last name:
        <input type="text" />
      </label><br></br><br></br>
      <label>Occupation:
        <input type="text" />
      </label><br></br><br></br>
      <label for="country">Country:</label><br></br>
      <select name="country" id="country">
          <option value="australia">Australia</option>
          <option value="canada">Canada</option>
          <option value="france">France</option>
          <option value="usa">U.S.A</option>
      </select><br></br><br></br>
      <button id="btn" class="btn btn-success" type="submit">Submit</button>
    </form>
    </div>
    </div>
    </div>
   )
}

export default Form



