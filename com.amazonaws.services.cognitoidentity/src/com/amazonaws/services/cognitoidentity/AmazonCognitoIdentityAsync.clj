(ns com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityAsync
  "Interface for accessing Amazon Cognito Identity asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCognitoIdentityAsync instead.


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
  (:import [com.amazonaws.services.cognitoidentity AmazonCognitoIdentityAsync]))

(defn untag-resource-async
  "Removes the specified tags from an Amazon Cognito identity pool. You can use this action up to 5 times per
   second, per account

  untag-resource-request - `com.amazonaws.services.cognitoidentity.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn merge-developer-identities-async
  "Merges two users having different IdentityIds, existing in the same identity pool, and identified by
   the same developer provider. You can use this action to request that discrete users be merged and identified as a
   single user in the Cognito environment. Cognito associates the given source user (
   SourceUserIdentifier) with the IdentityId of the DestinationUserIdentifier
   . Only developer-authenticated users can be merged. If the users to be merged are associated with the same public
   provider, but as two different users, an exception will be thrown.


   The number of linked logins is limited to 20. So, the number of linked logins for the source user,
   SourceUserIdentifier, and the destination user, DestinationUserIdentifier, together
   should not be larger than 20. Otherwise, an exception will be thrown.


   You must use AWS Developer credentials to call this API.

  merge-developer-identities-request - Input to the MergeDeveloperIdentities action. - `com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergeDeveloperIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest merge-developer-identities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeDeveloperIdentitiesAsync merge-developer-identities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest merge-developer-identities-request]
    (-> this (.mergeDeveloperIdentitiesAsync merge-developer-identities-request))))

(defn get-id-async
  "Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account.


   This is a public API. You do not need any credentials to call this API.

  get-id-request - Input to the GetId action. - `com.amazonaws.services.cognitoidentity.model.GetIdRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetIdResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetIdRequest get-id-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdAsync get-id-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetIdRequest get-id-request]
    (-> this (.getIdAsync get-id-request))))

(defn get-open-id-token-for-developer-identity-async
  "Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a user authenticated
   by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can
   only specify one developer provider as part of the Logins map, which is linked to the identity pool.
   The developer provider is the \"domain\" by which Cognito will refer to your users.


   You can use GetOpenIdTokenForDeveloperIdentity to create a new identity and to link new logins (that
   is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to
   create a new identity, the IdentityId should be null. When you want to associate a new login with an
   existing authenticated/unauthenticated identity, you can do so by providing the existing IdentityId.
   This API will create the identity in the specified IdentityPoolId.


   You must use AWS Developer credentials to call this API.

  get-open-id-token-for-developer-identity-request - Input to the GetOpenIdTokenForDeveloperIdentity action. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpenIdTokenForDeveloperIdentity operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest get-open-id-token-for-developer-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpenIdTokenForDeveloperIdentityAsync get-open-id-token-for-developer-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest get-open-id-token-for-developer-identity-request]
    (-> this (.getOpenIdTokenForDeveloperIdentityAsync get-open-id-token-for-developer-identity-request))))

(defn unlink-developer-identity-async
  "Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer users will be
   considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated
   identities as well as the developer user identifier, the Cognito identity becomes inaccessible.


   You must use AWS Developer credentials to call this API.

  unlink-developer-identity-request - Input to the UnlinkDeveloperIdentity action. - `com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnlinkDeveloperIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest unlink-developer-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unlinkDeveloperIdentityAsync unlink-developer-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest unlink-developer-identity-request]
    (-> this (.unlinkDeveloperIdentityAsync unlink-developer-identity-request))))

(defn get-credentials-for-identity-async
  "Returns credentials for the provided identity ID. Any provided logins will be validated against supported login
   providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token
   Service with the appropriate role for the token.


   This is a public API. You do not need any credentials to call this API.

  get-credentials-for-identity-request - Input to the GetCredentialsForIdentity action. - `com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCredentialsForIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest get-credentials-for-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCredentialsForIdentityAsync get-credentials-for-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest get-credentials-for-identity-request]
    (-> this (.getCredentialsForIdentityAsync get-credentials-for-identity-request))))

(defn create-identity-pool-async
  "Creates a new identity pool. The identity pool is a store of user identity information that is specific to your
   AWS account. The limit on identity pools is 60 per account. The keys for SupportedLoginProviders are
   as follows:




   Facebook: graph.facebook.com




   Google: accounts.google.com




   Amazon: www.amazon.com




   Twitter: api.twitter.com




   Digits: www.digits.com




   You must use AWS Developer credentials to call this API.

  create-identity-pool-request - Input to the CreateIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest create-identity-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIdentityPoolAsync create-identity-pool-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest create-identity-pool-request]
    (-> this (.createIdentityPoolAsync create-identity-pool-request))))

(defn lookup-developer-identity-async
  "Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list of
   DeveloperUserIdentifier values associated with an IdentityId for an existing identity.
   Either IdentityID or DeveloperUserIdentifier must not be null. If you supply only one
   of these values, the other value will be searched in the database and returned as a part of the response. If you
   supply both, DeveloperUserIdentifier will be matched against IdentityID. If the values
   are verified against the database, the response returns both values and is the same as the request. Otherwise a
   ResourceConflictException is thrown.


   LookupDeveloperIdentity is intended for low-throughput control plane operations: for example, to
   enable customer service to locate an identity ID by username. If you are using it for higher-volume operations
   such as user authentication, your requests are likely to be throttled. GetOpenIdTokenForDeveloperIdentity
   is a better option for higher-volume operations for user authentication.


   You must use AWS Developer credentials to call this API.

  lookup-developer-identity-request - Input to the LookupDeveloperIdentityInput action. - `com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LookupDeveloperIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest lookup-developer-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.lookupDeveloperIdentityAsync lookup-developer-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest lookup-developer-identity-request]
    (-> this (.lookupDeveloperIdentityAsync lookup-developer-identity-request))))

(defn list-identities-async
  "Lists the identities in an identity pool.


   You must use AWS Developer credentials to call this API.

  list-identities-request - Input to the ListIdentities action. - `com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest list-identities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentitiesAsync list-identities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest list-identities-request]
    (-> this (.listIdentitiesAsync list-identities-request))))

(defn describe-identity-pool-async
  "Gets details about a particular identity pool, including the pool name, ID description, creation date, and
   current number of users.


   You must use AWS Developer credentials to call this API.

  describe-identity-pool-request - Input to the DescribeIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest describe-identity-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityPoolAsync describe-identity-pool-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest describe-identity-pool-request]
    (-> this (.describeIdentityPoolAsync describe-identity-pool-request))))

(defn unlink-identity-async
  "Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next
   time they are seen. Removing the last linked login will make this identity inaccessible.


   This is a public API. You do not need any credentials to call this API.

  unlink-identity-request - Input to the UnlinkIdentity action. - `com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnlinkIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UnlinkIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest unlink-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unlinkIdentityAsync unlink-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest unlink-identity-request]
    (-> this (.unlinkIdentityAsync unlink-identity-request))))

(defn delete-identities-async
  "Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete.


   You must use AWS Developer credentials to call this API.

  delete-identities-request - Input to the DeleteIdentities action. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest delete-identities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentitiesAsync delete-identities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest delete-identities-request]
    (-> this (.deleteIdentitiesAsync delete-identities-request))))

(defn get-identity-pool-roles-async
  "Gets the roles for an identity pool.


   You must use AWS Developer credentials to call this API.

  get-identity-pool-roles-request - Input to the GetIdentityPoolRoles action. - `com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityPoolRoles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest get-identity-pool-roles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityPoolRolesAsync get-identity-pool-roles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest get-identity-pool-roles-request]
    (-> this (.getIdentityPoolRolesAsync get-identity-pool-roles-request))))

(defn delete-identity-pool-async
  "Deletes an identity pool. Once a pool is deleted, users will not be able to authenticate with the pool.


   You must use AWS Developer credentials to call this API.

  delete-identity-pool-request - Input to the DeleteIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest delete-identity-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentityPoolAsync delete-identity-pool-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest delete-identity-pool-request]
    (-> this (.deleteIdentityPoolAsync delete-identity-pool-request))))

(defn list-identity-pools-async
  "Lists all of the Cognito identity pools registered for your account.


   You must use AWS Developer credentials to call this API.

  list-identity-pools-request - Input to the ListIdentityPools action. - `com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentityPools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest list-identity-pools-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentityPoolsAsync list-identity-pools-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest list-identity-pools-request]
    (-> this (.listIdentityPoolsAsync list-identity-pools-request))))

(defn list-tags-for-resource-async
  "Lists the tags that are assigned to an Amazon Cognito identity pool.


   A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by
   purpose, owner, environment, or other criteria.


   You can use this action up to 10 times per second, per account.

  list-tags-for-resource-request - `com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn set-identity-pool-roles-async
  "Sets the roles for an identity pool. These roles are used when making calls to GetCredentialsForIdentity
   action.


   You must use AWS Developer credentials to call this API.

  set-identity-pool-roles-request - Input to the SetIdentityPoolRoles action. - `com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityPoolRoles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest set-identity-pool-roles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityPoolRolesAsync set-identity-pool-roles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest set-identity-pool-roles-request]
    (-> this (.setIdentityPoolRolesAsync set-identity-pool-roles-request))))

(defn get-open-id-token-async
  "Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by GetId. You can
   optionally add additional logins for the identity. Supplying multiple logins creates an implicit link.


   The OpenId token is valid for 10 minutes.


   This is a public API. You do not need any credentials to call this API.

  get-open-id-token-request - Input to the GetOpenIdToken action. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpenIdToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest get-open-id-token-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpenIdTokenAsync get-open-id-token-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest get-open-id-token-request]
    (-> this (.getOpenIdTokenAsync get-open-id-token-request))))

(defn describe-identity-async
  "Returns metadata related to the given identity, including when the identity was created and any associated linked
   logins.


   You must use AWS Developer credentials to call this API.

  describe-identity-request - Input to the DescribeIdentity action. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest describe-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityAsync describe-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest describe-identity-request]
    (-> this (.describeIdentityAsync describe-identity-request))))

(defn update-identity-pool-async
  "Updates an identity pool.


   You must use AWS Developer credentials to call this API.

  update-identity-pool-request - An object representing an Amazon Cognito identity pool. - `com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIdentityPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest update-identity-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIdentityPoolAsync update-identity-pool-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest update-identity-pool-request]
    (-> this (.updateIdentityPoolAsync update-identity-pool-request))))

(defn tag-resource-async
  "Assigns a set of tags to an Amazon Cognito identity pool. A tag is a label that you can use to categorize and
   manage identity pools in different ways, such as by purpose, owner, environment, or other criteria.


   Each tag consists of a key and value, both of which you define. A key is a general category for more specific
   values. For example, if you have two versions of an identity pool, one for testing and another for production,
   you might assign an Environment tag key to both identity pools. The value of this key might be
   Test for one identity pool and Production for the other.


   Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the
   Billing and Cost Management console, where you can track the costs associated with your identity pools. In an IAM
   policy, you can constrain permissions for identity pools based on specific tags or tag values.


   You can use this action up to 5 times per second, per account. An identity pool can have as many as 50 tags.

  tag-resource-request - `com.amazonaws.services.cognitoidentity.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidentity.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCognitoIdentityAsync this ^com.amazonaws.services.cognitoidentity.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

