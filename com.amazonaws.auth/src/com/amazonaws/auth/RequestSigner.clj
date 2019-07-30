(ns com.amazonaws.auth.RequestSigner
  "A strategy for applying cryptographic signatures to a request, proving
  that the request was made by someone in posession of the given set of
  credentials without transmitting the secret key over the wire."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth RequestSigner]))

(defn sign
  "Sign the given request - modifies the
   passed-in request to apply the signature.

  request - The request to sign. - `com.amazonaws.SignableRequest`"
  ([^RequestSigner this ^com.amazonaws.SignableRequest request]
    (-> this (.sign request))))

