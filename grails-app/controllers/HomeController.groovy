class HomeController {

  def index() {
    if (params.forward) {
       forward(action: 'imForwardedTo')
    } else {
       render(text: "ID is ${params.id}") 
    }
  }

  def imForwardedTo() {
    render(text: "Forward ID is ${params.id}")
  } 
 
}
