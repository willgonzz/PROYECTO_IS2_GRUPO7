'use client'


import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { signIn, signOut } from "next-auth/react";
import {
  faUserGroup
} from "@fortawesome/free-solid-svg-icons";
import routes from "@/app/routes";
import Link from "next/link";

export default function Autentication() {
  return (
    <>
      <div className="container">
        <section className="text-center">
          <p className="text-light h1 pb-3">Bienvenido a PoliBlog</p>
          <p className="text-light h6">Continuar con</p>
        </section>

        <section className="text-center">
          {/* google button */}
          <button type="button" className="btn btn-floating mx-1" onClick={() => signIn()}  >
            <div className="container">
              <div className="col">
                <div className="row">
                <svg xmlns="http://www.w3.org/2000/svg" height="2em" viewBox="0 0 488 512">
                  <path d="M488 261.8C488 403.3 391.1 504 248 504 110.8 504 0 393.2 0 256S110.8 8 248 8c66.8 0 123 24.5 166.3 64.9l-67.5 64.9C258.5 52.6 94.3 116.6 94.3 256c0 86.5 69.1 156.6 153.7 156.6 98.2 0 135-70.4 140.8-106.9H248v-85.3h236.1c2.3 12.7 3.9 24.9 3.9 41.4" fill="white"/>
                </svg>
                </div>
                <div className="row text-light row d-flex justify-content-center">
                  Google
                </div>
              </div>
            </div>
          </button>

          {/* guest button */}
          <Link type="button" className="btn btn-floating mx-1" href={routes.home.path}>
            <div className="container">
              <div className="col">
                <div className="row d-flex justify-content-center">
                  <FontAwesomeIcon
                    style={{ color: "white", fontSize: "2em" }}
                    icon={faUserGroup}
                  />
                </div>
                <div className="row text-light d-flex justify-content-center">
                  Invitado
                </div>
              </div>
            </div>
          </Link>
        </section>
      </div>
    </>
  )
}