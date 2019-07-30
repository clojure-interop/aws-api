(ns com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity
  "Interface for accessing Amazon Cognito Identity.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCognitoIdentity instead.


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
  (:import [com.amazonaws.services.cognitoidentity AmazonCognitoIdentity]))

(defn list-tags-for-resource
  "Lists the tags that are assigned to an Amazon Cognito identity pool.


   A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by
   purpose, owner, environment, or other criteria.


   You can use this action up to 10 times per second, per account.

  list-tags-for-resource-request - `com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn update-identity-pool
  "Updates an identity pool.


   You must use AWS Developer credentials to call this API.

  update-identity-pool-request - An object representing an Amazon Cognito identity pool. - `com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest`

  returns: Result of the UpdateIdentityPool operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest update-identity-pool-request]
    (-> this (.updateIdentityPool update-identity-pool-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonCognitoIdentity this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-identity-pools
  "Lists all of the Cognito identity pools registered for your account.


   You must use AWS Developer credentials to call this API.

  list-identity-pools-request - Input to the ListIdentityPools action. - `com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest`

  returns: Result of the ListIdentityPools operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest list-identity-pools-request]
    (-> this (.listIdentityPools list-identity-pools-request))))

(defn get-credentials-for-identity
  "Returns credentials for the provided identity ID. Any provided logins will be validated against supported login
   providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token
   Service with the appropriate role for the token.


   This is a public API. You do not need any credentials to call this API.

  get-credentials-for-identity-request - Input to the GetCredentialsForIdentity action. - `com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest`

  returns: Result of the GetCredentialsForIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest get-credentials-for-identity-request]
    (-> this (.getCredentialsForIdentity get-credentials-for-identity-request))))

(defn delete-identity-pool
  "Deletes an identity pool. Once a pool is deleted, users will not be able to authenticate with the pool.


   You must use AWS Developer credentials to call this API.

  delete-identity-pool-request - Input to the DeleteIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest`

  returns: Result of the DeleteIdentityPool operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest delete-identity-pool-request]
    (-> this (.deleteIdentityPool delete-identity-pool-request))))

(defn untag-resource
  "Removes the specified tags from an Amazon Cognito identity pool. You can use this action up to 5 times per
   second, per account

  untag-resource-request - `com.amazonaws.services.cognitoidentity.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.UntagResourceResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.UntagResourceResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn describe-identity-pool
  "Gets details about a particular identity pool, including the pool name, ID description, creation date, and
   current number of users.


   You must use AWS Developer credentials to call this API.

  describe-identity-pool-request - Input to the DescribeIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest`

  returns: Result of the DescribeIdentityPool operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest describe-identity-pool-request]
    (-> this (.describeIdentityPool describe-identity-pool-request))))

(defn get-open-id-token-for-developer-identity
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

  returns: Result of the GetOpenIdTokenForDeveloperIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest get-open-id-token-for-developer-identity-request]
    (-> this (.getOpenIdTokenForDeveloperIdentity get-open-id-token-for-developer-identity-request))))

(defn unlink-developer-identity
  "Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer users will be
   considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated
   identities as well as the developer user identifier, the Cognito identity becomes inaccessible.


   You must use AWS Developer credentials to call this API.

  unlink-developer-identity-request - Input to the UnlinkDeveloperIdentity action. - `com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest`

  returns: Result of the UnlinkDeveloperIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest unlink-developer-identity-request]
    (-> this (.unlinkDeveloperIdentity unlink-developer-identity-request))))

(defn lookup-developer-identity
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

  returns: Result of the LookupDeveloperIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest lookup-developer-identity-request]
    (-> this (.lookupDeveloperIdentity lookup-developer-identity-request))))

(defn get-identity-pool-roles
  "Gets the roles for an identity pool.


   You must use AWS Developer credentials to call this API.

  get-identity-pool-roles-request - Input to the GetIdentityPoolRoles action. - `com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest`

  returns: Result of the GetIdentityPoolRoles operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest get-identity-pool-roles-request]
    (-> this (.getIdentityPoolRoles get-identity-pool-roles-request))))

(defn delete-identities
  "Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete.


   You must use AWS Developer credentials to call this API.

  delete-identities-request - Input to the DeleteIdentities action. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest`

  returns: Result of the DeleteIdentities operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest delete-identities-request]
    (-> this (.deleteIdentities delete-identities-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonCognitoIdentity this]
    (-> this (.shutdown))))

(defn create-identity-pool
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

  returns: Result of the CreateIdentityPool operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest create-identity-pool-request]
    (-> this (.createIdentityPool create-identity-pool-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"cognito-identity.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://cognito-identity.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonCognitoIdentity this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-identity-pool-roles
  "Sets the roles for an identity pool. These roles are used when making calls to GetCredentialsForIdentity
   action.


   You must use AWS Developer credentials to call this API.

  set-identity-pool-roles-request - Input to the SetIdentityPoolRoles action. - `com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest`

  returns: Result of the SetIdentityPoolRoles operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest set-identity-pool-roles-request]
    (-> this (.setIdentityPoolRoles set-identity-pool-roles-request))))

(defn get-id
  "Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account.


   This is a public API. You do not need any credentials to call this API.

  get-id-request - Input to the GetId action. - `com.amazonaws.services.cognitoidentity.model.GetIdRequest`

  returns: Result of the GetId operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.GetIdResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.GetIdResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.GetIdRequest get-id-request]
    (-> this (.getId get-id-request))))

(defn list-identities
  "Lists the identities in an identity pool.


   You must use AWS Developer credentials to call this API.

  list-identities-request - Input to the ListIdentities action. - `com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest`

  returns: Result of the ListIdentities operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest list-identities-request]
    (-> this (.listIdentities list-identities-request))))

(defn merge-developer-identities
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

  returns: Result of the MergeDeveloperIdentities operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest merge-developer-identities-request]
    (-> this (.mergeDeveloperIdentities merge-developer-identities-request))))

(defn get-open-id-token
  "Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by GetId. You can
   optionally add additional logins for the identity. Supplying multiple logins creates an implicit link.


   The OpenId token is valid for 10 minutes.


   This is a public API. You do not need any credentials to call this API.

  get-open-id-token-request - Input to the GetOpenIdToken action. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest`

  returns: Result of the GetOpenIdToken operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest get-open-id-token-request]
    (-> this (.getOpenIdToken get-open-id-token-request))))

(defn describe-identity
  "Returns metadata related to the given identity, including when the identity was created and any associated linked
   logins.


   You must use AWS Developer credentials to call this API.

  describe-identity-request - Input to the DescribeIdentity action. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest`

  returns: Result of the DescribeIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest describe-identity-request]
    (-> this (.describeIdentity describe-identity-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCognitoIdentity this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
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

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.TagResourceResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.TagResourceResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn unlink-identity
  "Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next
   time they are seen. Removing the last linked login will make this identity inaccessible.


   This is a public API. You do not need any credentials to call this API.

  unlink-identity-request - Input to the UnlinkIdentity action. - `com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest`

  returns: Result of the UnlinkIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.UnlinkIdentityResult`

  throws: com.amazonaws.services.cognitoidentity.model.InvalidParameterException - Thrown for missing or bad input parameter(s)."
  (^com.amazonaws.services.cognitoidentity.model.UnlinkIdentityResult [^AmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest unlink-identity-request]
    (-> this (.unlinkIdentity unlink-identity-request))))

