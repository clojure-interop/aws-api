(ns com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityAsyncClient
  "Client for accessing Amazon Cognito Identity asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Cognito Federated Identities

  Amazon Cognito Federated Identities is a web service that delivers scoped temporary credentials to mobile devices and
  other untrusted environments. It uniquely identifies a device and supplies the user with a consistent identity over
  the lifetime of an application.


  Using Amazon Cognito Federated Identities, you can enable authentication with one or more third-party identity
  providers (Facebook, Google, or Login with Amazon) or an Amazon Cognito user pool, and you can also choose to support
  unauthenticated access from your app. Cognito delivers a unique identifier for each user and acts as an OpenID token
  provider trusted by AWS Security Token Service (STS) to access temporary, limited-privilege AWS credentials.


  For a description of the authentication flow from the Amazon Cognito Developer Guide see Authentication Flow.


  For more information see Amazon Cognito Federated
  Identities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cognitoidentity AmazonCognitoIdentityAsyncClient]))

(defn ->amazon-cognito-identity-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonCognitoIdentityAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCognitoIdentityAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonCognitoIdentityAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCognitoIdentityAsyncClient aws-credentials executor-service))
  (^AmazonCognitoIdentityAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCognitoIdentityAsyncClient client-configuration))
  (^AmazonCognitoIdentityAsyncClient []
    (new AmazonCognitoIdentityAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityAsyncClientBuilder`"
  (^com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityAsyncClientBuilder []
    (AmazonCognitoIdentityAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - `com.amazonaws.services.cognitoidentity.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn merge-developer-identities-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the MergeDeveloperIdentities action. - `com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergeDeveloperIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeDeveloperIdentitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest request]
    (-> this (.mergeDeveloperIdentitiesAsync request))))

(defn get-id-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the GetId action. - `com.amazonaws.services.cognitoidentity.model.GetIdRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetIdResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.GetIdRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.GetIdRequest request]
    (-> this (.getIdAsync request))))

(defn get-open-id-token-for-developer-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the GetOpenIdTokenForDeveloperIdentity action. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpenIdTokenForDeveloperIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpenIdTokenForDeveloperIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest request]
    (-> this (.getOpenIdTokenForDeveloperIdentityAsync request))))

(defn unlink-developer-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the UnlinkDeveloperIdentity action. - `com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnlinkDeveloperIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unlinkDeveloperIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest request]
    (-> this (.unlinkDeveloperIdentityAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonCognitoIdentityAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-credentials-for-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the GetCredentialsForIdentity action. - `com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCredentialsForIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCredentialsForIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest request]
    (-> this (.getCredentialsForIdentityAsync request))))

(defn create-identity-pool-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the CreateIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIdentityPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest request]
    (-> this (.createIdentityPoolAsync request))))

(defn lookup-developer-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the LookupDeveloperIdentityInput action. - `com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LookupDeveloperIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.lookupDeveloperIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest request]
    (-> this (.lookupDeveloperIdentityAsync request))))

(defn list-identities-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the ListIdentities action. - `com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest request]
    (-> this (.listIdentitiesAsync request))))

(defn describe-identity-pool-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the DescribeIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest request]
    (-> this (.describeIdentityPoolAsync request))))

(defn unlink-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the UnlinkIdentity action. - `com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnlinkIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UnlinkIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unlinkIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest request]
    (-> this (.unlinkIdentityAsync request))))

(defn delete-identities-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the DeleteIdentities action. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest request]
    (-> this (.deleteIdentitiesAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonCognitoIdentityAsyncClient this]
    (-> this (.shutdown))))

(defn get-identity-pool-roles-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the GetIdentityPoolRoles action. - `com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityPoolRoles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityPoolRolesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest request]
    (-> this (.getIdentityPoolRolesAsync request))))

(defn delete-identity-pool-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the DeleteIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentityPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest request]
    (-> this (.deleteIdentityPoolAsync request))))

(defn list-identity-pools-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the ListIdentityPools action. - `com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentityPools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentityPoolsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest request]
    (-> this (.listIdentityPoolsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - `com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn set-identity-pool-roles-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the SetIdentityPoolRoles action. - `com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityPoolRoles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityPoolRolesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest request]
    (-> this (.setIdentityPoolRolesAsync request))))

(defn get-open-id-token-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the GetOpenIdToken action. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpenIdToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpenIdTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest request]
    (-> this (.getOpenIdTokenAsync request))))

(defn describe-identity-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - Input to the DescribeIdentity action. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest request]
    (-> this (.describeIdentityAsync request))))

(defn update-identity-pool-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - An object representing an Amazon Cognito identity pool. - `com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIdentityPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest request]
    (-> this (.updateIdentityPoolAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonCognitoIdentityAsync

  request - `com.amazonaws.services.cognitoidentity.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsyncClient this ^com.amazonaws.services.cognitoidentity.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

