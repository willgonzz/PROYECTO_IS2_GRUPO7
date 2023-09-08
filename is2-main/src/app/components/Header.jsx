import Link from "next/link"
import routes from "@/app/routes"

export default function Header() {

  return (
    <section className="container-fluid text-light bg-primary py-4">
      <div className="row text-center">
        <div className="col-3 h3">
          PoliBlog
        </div>
        <div className="col-6">
          <input type="search" class="form-control form-rounded" placeholder="🔍 Buscar" />
        </div>
        

        <div className="col-3">
          <Link href={routes.auth.path}>
            <img style={{height: "40px", width: "40px"}} class="rounded-circle" alt="avatar1"
              src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973461_640.png" />
          </Link>
        </div>
      </div>
    </section>
  )
}