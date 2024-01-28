// Card.jsx
import React from "react";

export default function Card({ id, imagen, titulo, descripcion }) {
  return (
    <div className="card m-2" style={{ width: "18rem"}}>
      <img
        src={imagen}
        className="card-img-top"
        alt={titulo}
        style={{ objectFit: "contain", height: "60%", width: "100%", padding: "0.2rem", marginTop:"0.4rem"}}
      />
      <div className="card-body">
        <h5 className="card-title">{titulo}</h5>
        <p className="card-text">{descripcion}</p>
        <a href="/" className="btn btn-primary">
          Ver más
        </a>
      </div>
    </div>
  );
}
