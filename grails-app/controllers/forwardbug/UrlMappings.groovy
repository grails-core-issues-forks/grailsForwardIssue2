package forwardbug

class UrlMappings {

    static mappings = {

        "/forward/$id"(controller: 'home', action: 'index')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
