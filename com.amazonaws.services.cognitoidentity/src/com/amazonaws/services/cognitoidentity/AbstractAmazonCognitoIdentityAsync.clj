(ns com.amazonaws.services.cognitoidentity.AbstractAmazonCognitoIdentityAsync
  "Abstract implementation of AmazonCognitoIdentityAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cognitoidentity AbstractAmazonCognitoIdentityAsync]))

(defn untag-resource-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - `com.amazonaws.services.cognitoidentity.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn merge-developer-identities-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the MergeDeveloperIdentities action. - `com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergeDeveloperIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeDeveloperIdentitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest request]
    (-> this (.mergeDeveloperIdentitiesAsync request))))

(defn get-id-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the GetId action. - `com.amazonaws.services.cognitoidentity.model.GetIdRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetIdResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetIdRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetIdRequest request]
    (-> this (.getIdAsync request))))

(defn get-open-id-token-for-developer-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the GetOpenIdTokenForDeveloperIdentity action. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpenIdTokenForDeveloperIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpenIdTokenForDeveloperIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest request]
    (-> this (.getOpenIdTokenForDeveloperIdentityAsync request))))

(defn unlink-developer-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the UnlinkDeveloperIdentity action. - `com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnlinkDeveloperIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unlinkDeveloperIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest request]
    (-> this (.unlinkDeveloperIdentityAsync request))))

(defn get-credentials-for-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the GetCredentialsForIdentity action. - `com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCredentialsForIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCredentialsForIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest request]
    (-> this (.getCredentialsForIdentityAsync request))))

(defn create-identity-pool-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the CreateIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIdentityPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest request]
    (-> this (.createIdentityPoolAsync request))))

(defn lookup-developer-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the LookupDeveloperIdentityInput action. - `com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LookupDeveloperIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.lookupDeveloperIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest request]
    (-> this (.lookupDeveloperIdentityAsync request))))

(defn list-identities-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the ListIdentities action. - `com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest request]
    (-> this (.listIdentitiesAsync request))))

(defn describe-identity-pool-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the DescribeIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest request]
    (-> this (.describeIdentityPoolAsync request))))

(defn unlink-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the UnlinkIdentity action. - `com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnlinkIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UnlinkIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unlinkIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest request]
    (-> this (.unlinkIdentityAsync request))))

(defn delete-identities-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the DeleteIdentities action. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest request]
    (-> this (.deleteIdentitiesAsync request))))

(defn get-identity-pool-roles-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the GetIdentityPoolRoles action. - `com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityPoolRoles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityPoolRolesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest request]
    (-> this (.getIdentityPoolRolesAsync request))))

(defn delete-identity-pool-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the DeleteIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentityPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest request]
    (-> this (.deleteIdentityPoolAsync request))))

(defn list-identity-pools-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the ListIdentityPools action. - `com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentityPools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentityPoolsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest request]
    (-> this (.listIdentityPoolsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - `com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn set-identity-pool-roles-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the SetIdentityPoolRoles action. - `com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityPoolRoles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityPoolRolesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest request]
    (-> this (.setIdentityPoolRolesAsync request))))

(defn get-open-id-token-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the GetOpenIdToken action. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpenIdToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpenIdTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest request]
    (-> this (.getOpenIdTokenAsync request))))

(defn describe-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the DescribeIdentity action. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest request]
    (-> this (.describeIdentityAsync request))))

(defn update-identity-pool-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - An object representing an Amazon Cognito identity pool. - `com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIdentityPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest request]
    (-> this (.updateIdentityPoolAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - `com.amazonaws.services.cognitoidentity.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

