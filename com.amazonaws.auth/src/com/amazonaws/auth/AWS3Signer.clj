(ns com.amazonaws.auth.AWS3Signer
  "Signer implementation that signs requests with the AWS3 signing protocol."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AWS3Signer]))

(defn ->aws-3-signer
  "Constructor."
  (^AWS3Signer []
    (new AWS3Signer )))

(defn sign
  "Signs the specified request with the AWS3 signing protocol by using the
   AWS account credentials specified when this object was constructed and
   adding the required AWS3 headers to the request.

  request - The request to sign. - `com.amazonaws.SignableRequest`
  credentials - The credentials to sign the request with. - `com.amazonaws.auth.AWSCredentials`

  throws: com.amazonaws.SdkClientException"
  ([^AWS3Signer this ^com.amazonaws.SignableRequest request ^com.amazonaws.auth.AWSCredentials credentials]
    (-> this (.sign request credentials))))

