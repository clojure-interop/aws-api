(ns com.amazonaws.auth.Signer
  "A strategy for applying cryptographic signatures to a request, proving
  that the request was made by someone in posession of the given set of
  credentials without transmitting the secret key over the wire."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth Signer]))

(defn sign
  "Sign the given request with the given set of credentials. Modifies the
   passed-in request to apply the signature.

  request - The request to sign. - `com.amazonaws.SignableRequest`
  credentials - The credentials to sign the request with. - `com.amazonaws.auth.AWSCredentials`"
  ([^Signer this ^com.amazonaws.SignableRequest request ^com.amazonaws.auth.AWSCredentials credentials]
    (-> this (.sign request credentials))))

