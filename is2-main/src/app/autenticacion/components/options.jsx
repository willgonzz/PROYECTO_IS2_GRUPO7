'use client'

import { useState } from "react";

export default function Options({options}) {  
  const [ selected, setSelected ] = useState(options[0] ? options[0] : null);

  const handleClick = (option) => {
    setSelected(option);
  }

  return (
    <>
      <ul className="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
        {options.map(option => (
          <li key={option} className="nav-item" role="presentation">
            <button
              onClick={() => handleClick(option)}
              id="tab-login" data-mdb-toggle="pill" role="tab"
              className={`nav-link ${selected === option ? "active" : ""}`}
              aria-controls="pills-login" aria-selected="true"
            >
              {option}
            </button>
          </li>
        ))}
      </ul>
    </>
  )
}