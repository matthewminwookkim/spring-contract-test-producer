package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/hello-world'
        headers {
            contentType applicationJson()
        }
    }
    response {
        status OK()
        body([
               'message': 'hello world'
        ])
        headers {
            contentType applicationJson()
        }
    }
}
