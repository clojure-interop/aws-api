(ns com.amazonaws.services.servicecatalog.AWSServiceCatalogClient
  "Client for accessing AWS Service Catalog. All service calls made using this client are blocking, and will not return
  until the service call completes.

  AWS Service Catalog

  AWS Service Catalog enables organizations to create and manage
  catalogs of IT services that are approved for use on AWS. To get the most out of this documentation, you should be
  familiar with the terminology discussed in AWS Service Catalog
  Concepts."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicecatalog AWSServiceCatalogClient]))

(defn ->aws-service-catalog-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Service Catalog (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSServiceCatalogClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSServiceCatalogClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSServiceCatalogClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSServiceCatalogClient aws-credentials client-configuration))
  (^AWSServiceCatalogClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSServiceCatalogClient client-configuration))
  (^AWSServiceCatalogClient []
    (new AWSServiceCatalogClient )))

(defn *builder
  "returns: `com.amazonaws.services.servicecatalog.AWSServiceCatalogClientBuilder`"
  (^com.amazonaws.services.servicecatalog.AWSServiceCatalogClientBuilder []
    (AWSServiceCatalogClient/builder )))

(defn create-portfolio-share
  "Shares the specified portfolio with the specified account or organization node. Shares to an organization node
   can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to
   create a portfolio share to an organization node.

  request - `com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest`

  returns: Result of the CreatePortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest request]
    (-> this (.createPortfolioShare request))))

(defn delete-provisioned-product-plan
  "Deletes the specified plan.

  request - `com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest`

  returns: Result of the DeleteProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest request]
    (-> this (.deleteProvisionedProductPlan request))))

(defn disable-aws-organizations-access
  "Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but
   it will prevent you from creating new shares throughout your organization. Current shares will not be in sync
   with your organization structure if it changes after calling this API. This API can only be called by the master
   account in the organization.

  request - `com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest`

  returns: Result of the DisableAWSOrganizationsAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest request]
    (-> this (.disableAWSOrganizationsAccess request))))

(defn list-tag-options
  "Lists the specified TagOptions or all TagOptions.

  request - `com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest`

  returns: Result of the ListTagOptions operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListTagOptionsResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.ListTagOptionsResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest request]
    (-> this (.listTagOptions request))))

(defn delete-service-action
  "Deletes a self-service action.

  request - `com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest`

  returns: Result of the DeleteServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeleteServiceActionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest request]
    (-> this (.deleteServiceAction request))))

(defn list-resources-for-tag-option
  "Lists the resources associated with the specified TagOption.

  request - `com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest`

  returns: Result of the ListResourcesForTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest request]
    (-> this (.listResourcesForTagOption request))))

(defn create-constraint
  "Creates a constraint.

  request - `com.amazonaws.services.servicecatalog.model.CreateConstraintRequest`

  returns: Result of the CreateConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateConstraintResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.CreateConstraintResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.CreateConstraintRequest request]
    (-> this (.createConstraint request))))

(defn delete-tag-option
  "Deletes the specified TagOption.


   You cannot delete a TagOption if it is associated with a product or portfolio.

  request - `com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest`

  returns: Result of the DeleteTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest request]
    (-> this (.deleteTagOption request))))

(defn enable-aws-organizations-access
  "Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive
   updates on your organization in order to sync your shares with the current structure. This API can only be called
   by the master account in the organization.


   By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so
   that your shares can be in sync with any changes in your AWS Organizations structure.

  request - `com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest`

  returns: Result of the EnableAWSOrganizationsAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest request]
    (-> this (.enableAWSOrganizationsAccess request))))

(defn describe-portfolio
  "Gets information about the specified portfolio.

  request - `com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest`

  returns: Result of the DescribePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribePortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribePortfolioResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest request]
    (-> this (.describePortfolio request))))

(defn delete-product
  "Deletes the specified product.


   You cannot delete a product if it was shared with you or is associated with a portfolio.

  request - `com.amazonaws.services.servicecatalog.model.DeleteProductRequest`

  returns: Result of the DeleteProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeleteProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DeleteProductRequest request]
    (-> this (.deleteProduct request))))

(defn search-products
  "Gets information about the products to which the caller has access.

  request - `com.amazonaws.services.servicecatalog.model.SearchProductsRequest`

  returns: Result of the SearchProducts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.SearchProductsResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.SearchProductsResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.SearchProductsRequest request]
    (-> this (.searchProducts request))))

(defn describe-portfolio-share-status
  "Gets the status of the specified portfolio share operation. This API can only be called by the master account in
   the organization.

  request - `com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest`

  returns: Result of the DescribePortfolioShareStatus operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest request]
    (-> this (.describePortfolioShareStatus request))))

(defn batch-disassociate-service-action-from-provisioning-artifact
  "Disassociates a batch of self-service actions from the specified provisioning artifact.

  request - `com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest`

  returns: Result of the BatchDisassociateServiceActionFromProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest request]
    (-> this (.batchDisassociateServiceActionFromProvisioningArtifact request))))

(defn disassociate-service-action-from-provisioning-artifact
  "Disassociates the specified self-service action association from the specified provisioning artifact.

  request - `com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest`

  returns: Result of the DisassociateServiceActionFromProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest request]
    (-> this (.disassociateServiceActionFromProvisioningArtifact request))))

(defn reject-portfolio-share
  "Rejects an offer to share the specified portfolio.

  request - `com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest`

  returns: Result of the RejectPortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest request]
    (-> this (.rejectPortfolioShare request))))

(defn associate-principal-with-portfolio
  "Associates the specified principal ARN with the specified portfolio.

  request - `com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest`

  returns: Result of the AssociatePrincipalWithPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest request]
    (-> this (.associatePrincipalWithPortfolio request))))

(defn list-provisioning-artifacts
  "Lists all provisioning artifacts (also known as versions) for the specified product.

  request - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest`

  returns: Result of the ListProvisioningArtifacts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest request]
    (-> this (.listProvisioningArtifacts request))))

(defn describe-tag-option
  "Gets information about the specified TagOption.

  request - `com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest`

  returns: Result of the DescribeTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest request]
    (-> this (.describeTagOption request))))

(defn associate-product-with-portfolio
  "Associates the specified product with the specified portfolio.

  request - `com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest`

  returns: Result of the AssociateProductWithPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest request]
    (-> this (.associateProductWithPortfolio request))))

(defn update-constraint
  "Updates the specified constraint.

  request - `com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest`

  returns: Result of the UpdateConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateConstraintResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.UpdateConstraintResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest request]
    (-> this (.updateConstraint request))))

(defn list-accepted-portfolio-shares
  "Lists all portfolios for which sharing was accepted by this account.

  request - `com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest`

  returns: Result of the ListAcceptedPortfolioShares operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest request]
    (-> this (.listAcceptedPortfolioShares request))))

(defn describe-provisioning-artifact
  "Gets information about the specified provisioning artifact (also known as a version) for the specified product.

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest`

  returns: Result of the DescribeProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest request]
    (-> this (.describeProvisioningArtifact request))))

(defn create-portfolio
  "Creates a portfolio.

  request - `com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest`

  returns: Result of the CreatePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreatePortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.CreatePortfolioResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest request]
    (-> this (.createPortfolio request))))

(defn describe-product-view
  "Gets information about the specified product.

  request - `com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest`

  returns: Result of the DescribeProductView operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProductViewResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProductViewResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest request]
    (-> this (.describeProductView request))))

(defn terminate-provisioned-product
  "Terminates the specified provisioned product.


   This operation does not delete any records associated with the provisioned product.


   You can check the status of this request using DescribeRecord.

  request - `com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest`

  returns: Result of the TerminateProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest request]
    (-> this (.terminateProvisionedProduct request))))

(defn execute-provisioned-product-plan
  "Provisions or modifies a product based on the resource changes for the specified plan.

  request - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest`

  returns: Result of the ExecuteProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest request]
    (-> this (.executeProvisionedProductPlan request))))

(defn list-provisioning-artifacts-for-service-action
  "Lists all provisioning artifacts (also known as versions) for the specified self-service action.

  request - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest`

  returns: Result of the ListProvisioningArtifactsForServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest request]
    (-> this (.listProvisioningArtifactsForServiceAction request))))

(defn create-provisioned-product-plan
  "Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified
   (when updating a provisioned product) when the plan is executed.


   You can create one plan per provisioned product. To create a plan for an existing provisioned product, the
   product status must be AVAILBLE or TAINTED.


   To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify
   the provisioned product, use ExecuteProvisionedProductPlan.

  request - `com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest`

  returns: Result of the CreateProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest request]
    (-> this (.createProvisionedProductPlan request))))

(defn accept-portfolio-share
  "Accepts an offer to share the specified portfolio.

  request - `com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest`

  returns: Result of the AcceptPortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest request]
    (-> this (.acceptPortfolioShare request))))

(defn update-provisioned-product
  "Requests updates to the configuration of the specified provisioned product.


   If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates
   requested, this operation can update with no interruption, with some interruption, or replace the provisioned
   product entirely.


   You can check the status of this request using DescribeRecord.

  request - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest`

  returns: Result of the UpdateProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest request]
    (-> this (.updateProvisionedProduct request))))

(defn update-portfolio
  "Updates the specified portfolio.


   You cannot update a product that was shared with you.

  request - `com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest`

  returns: Result of the UpdatePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest request]
    (-> this (.updatePortfolio request))))

(defn update-provisioning-artifact
  "Updates the specified provisioning artifact (also known as a version) for the specified product.


   You cannot update a provisioning artifact for a product that was shared with you.

  request - `com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest`

  returns: Result of the UpdateProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest request]
    (-> this (.updateProvisioningArtifact request))))

(defn disassociate-budget-from-resource
  "Disassociates the specified budget from the specified resource.

  request - `com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest`

  returns: Result of the DisassociateBudgetFromResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest request]
    (-> this (.disassociateBudgetFromResource request))))

(defn describe-product
  "Gets information about the specified product.

  request - `com.amazonaws.services.servicecatalog.model.DescribeProductRequest`

  returns: Result of the DescribeProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeProductRequest request]
    (-> this (.describeProduct request))))

(defn update-provisioned-product-properties
  "Requests updates to the properties of the specified provisioned product.

  request - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest`

  returns: Result of the UpdateProvisionedProductProperties operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest request]
    (-> this (.updateProvisionedProductProperties request))))

(defn describe-copy-product-status
  "Gets the status of the specified copy product operation.

  request - `com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest`

  returns: Result of the DescribeCopyProductStatus operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest request]
    (-> this (.describeCopyProductStatus request))))

(defn create-tag-option
  "Creates a TagOption.

  request - `com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest`

  returns: Result of the CreateTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateTagOptionResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.CreateTagOptionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest request]
    (-> this (.createTagOption request))))

(defn create-provisioning-artifact
  "Creates a provisioning artifact (also known as a version) for the specified product.


   You cannot create a provisioning artifact for a product that was shared with you.

  request - `com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest`

  returns: Result of the CreateProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest request]
    (-> this (.createProvisioningArtifact request))))

(defn describe-provisioning-parameters
  "Gets information about the configuration required to provision the specified product using the specified
   provisioning artifact.


   If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key.
   The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to
   ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error
   \"Parameter validation failed: Missing required parameter in Tags[N]:Value\". Tag the provisioned
   product with the value sc-tagoption-conflict-portfolioId-productId.

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest`

  returns: Result of the DescribeProvisioningParameters operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest request]
    (-> this (.describeProvisioningParameters request))))

(defn list-constraints-for-portfolio
  "Lists the constraints for the specified portfolio and product.

  request - `com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest`

  returns: Result of the ListConstraintsForPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest request]
    (-> this (.listConstraintsForPortfolio request))))

(defn list-provisioned-product-plans
  "Lists the plans for the specified provisioned product or all plans to which the user has access.

  request - `com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest`

  returns: Result of the ListProvisionedProductPlans operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest request]
    (-> this (.listProvisionedProductPlans request))))

(defn associate-service-action-with-provisioning-artifact
  "Associates a self-service action with a provisioning artifact.

  request - `com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest`

  returns: Result of the AssociateServiceActionWithProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest request]
    (-> this (.associateServiceActionWithProvisioningArtifact request))))

(defn list-portfolio-access
  "Lists the account IDs that have access to the specified portfolio.

  request - `com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest`

  returns: Result of the ListPortfolioAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest request]
    (-> this (.listPortfolioAccess request))))

(defn search-products-as-admin
  "Gets information about the products for the specified portfolio or all products.

  request - `com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest`

  returns: Result of the SearchProductsAsAdmin operation returned by the service. - `com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest request]
    (-> this (.searchProductsAsAdmin request))))

(defn disassociate-product-from-portfolio
  "Disassociates the specified product from the specified portfolio.

  request - `com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest`

  returns: Result of the DisassociateProductFromPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest request]
    (-> this (.disassociateProductFromPortfolio request))))

(defn update-product
  "Updates the specified product.

  request - `com.amazonaws.services.servicecatalog.model.UpdateProductRequest`

  returns: Result of the UpdateProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.UpdateProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.UpdateProductRequest request]
    (-> this (.updateProduct request))))

(defn describe-service-action
  "Describes a self-service action.

  request - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest`

  returns: Result of the DescribeServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeServiceActionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest request]
    (-> this (.describeServiceAction request))))

(defn scan-provisioned-products
  "Lists the provisioned products that are available (not terminated).


   To use additional filtering, see SearchProvisionedProducts.

  request - `com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest`

  returns: Result of the ScanProvisionedProducts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest request]
    (-> this (.scanProvisionedProducts request))))

(defn describe-constraint
  "Gets information about the specified constraint.

  request - `com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest`

  returns: Result of the DescribeConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeConstraintResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeConstraintResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest request]
    (-> this (.describeConstraint request))))

(defn describe-provisioned-product
  "Gets information about the specified provisioned product.

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest`

  returns: Result of the DescribeProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest request]
    (-> this (.describeProvisionedProduct request))))

(defn update-tag-option
  "Updates the specified TagOption.

  request - `com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest`

  returns: Result of the UpdateTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest request]
    (-> this (.updateTagOption request))))

(defn list-principals-for-portfolio
  "Lists all principal ARNs associated with the specified portfolio.

  request - `com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest`

  returns: Result of the ListPrincipalsForPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest request]
    (-> this (.listPrincipalsForPortfolio request))))

(defn delete-constraint
  "Deletes the specified constraint.

  request - `com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest`

  returns: Result of the DeleteConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteConstraintResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeleteConstraintResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest request]
    (-> this (.deleteConstraint request))))

(defn execute-provisioned-product-service-action
  "Executes a self-service action against a provisioned product.

  request - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest`

  returns: Result of the ExecuteProvisionedProductServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest request]
    (-> this (.executeProvisionedProductServiceAction request))))

(defn create-product
  "Creates a product.

  request - `com.amazonaws.services.servicecatalog.model.CreateProductRequest`

  returns: Result of the CreateProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateProductResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.CreateProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.CreateProductRequest request]
    (-> this (.createProduct request))))

(defn list-record-history
  "Lists the specified requests or all performed requests.

  request - `com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest`

  returns: Result of the ListRecordHistory operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest request]
    (-> this (.listRecordHistory request))))

(defn list-budgets-for-resource
  "Lists all the budgets associated to the specified resource.

  request - `com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest`

  returns: Result of the ListBudgetsForResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest request]
    (-> this (.listBudgetsForResource request))))

(defn copy-product
  "Copies the specified source product to the specified target product or a new product.


   You can copy a product to the same account or another account. You can copy a product to the same region or
   another region.


   This operation is performed asynchronously. To track the progress of the operation, use
   DescribeCopyProductStatus.

  request - `com.amazonaws.services.servicecatalog.model.CopyProductRequest`

  returns: Result of the CopyProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CopyProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.CopyProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.CopyProductRequest request]
    (-> this (.copyProduct request))))

(defn list-service-actions-for-provisioning-artifact
  "Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning
   Artifact ID.

  request - `com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest`

  returns: Result of the ListServiceActionsForProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest request]
    (-> this (.listServiceActionsForProvisioningArtifact request))))

(defn describe-product-as-admin
  "Gets information about the specified product. This operation is run with administrator access.

  request - `com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest`

  returns: Result of the DescribeProductAsAdmin operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest request]
    (-> this (.describeProductAsAdmin request))))

(defn disassociate-tag-option-from-resource
  "Disassociates the specified TagOption from the specified resource.

  request - `com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest`

  returns: Result of the DisassociateTagOptionFromResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest request]
    (-> this (.disassociateTagOptionFromResource request))))

(defn describe-record
  "Gets information about the specified request operation.


   Use this operation after calling a request operation (for example, ProvisionProduct,
   TerminateProvisionedProduct, or UpdateProvisionedProduct).



   If a provisioned product was transferred to a new owner using UpdateProvisionedProductProperties, the new
   owner will be able to describe all past records for that product. The previous owner will no longer be able to
   describe the records, but will be able to use ListRecordHistory to see the product's history from when he
   was the owner.

  request - `com.amazonaws.services.servicecatalog.model.DescribeRecordRequest`

  returns: Result of the DescribeRecord operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeRecordResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeRecordResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeRecordRequest request]
    (-> this (.describeRecord request))))

(defn delete-portfolio-share
  "Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization
   node can only be deleted by the master account of an Organization.

  request - `com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest`

  returns: Result of the DeletePortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest request]
    (-> this (.deletePortfolioShare request))))

(defn search-provisioned-products
  "Gets information about the provisioned products that meet the specified criteria.

  request - `com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest`

  returns: Result of the SearchProvisionedProducts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest request]
    (-> this (.searchProvisionedProducts request))))

(defn list-organization-portfolio-access
  "Lists the organization nodes that have access to the specified portfolio. This API can only be called by the
   master account in the organization.

  request - `com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest`

  returns: Result of the ListOrganizationPortfolioAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest request]
    (-> this (.listOrganizationPortfolioAccess request))))

(defn describe-service-action-execution-parameters
  "request - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest`

  returns: Result of the DescribeServiceActionExecutionParameters operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest request]
    (-> this (.describeServiceActionExecutionParameters request))))

(defn create-service-action
  "Creates a self-service action.

  request - `com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest`

  returns: Result of the CreateServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.CreateServiceActionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest request]
    (-> this (.createServiceAction request))))

(defn list-portfolios-for-product
  "Lists all portfolios that the specified product is associated with.

  request - `com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest`

  returns: Result of the ListPortfoliosForProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest request]
    (-> this (.listPortfoliosForProduct request))))

(defn list-stack-instances-for-provisioned-product
  "Returns summary information about stack instances that are associated with the specified
   CFN_STACKSET type provisioned product. You can filter for stack instances that are associated with a
   specific AWS account name or region.

  request - `com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest`

  returns: Result of the ListStackInstancesForProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest request]
    (-> this (.listStackInstancesForProvisionedProduct request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSServiceCatalogClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-launch-paths
  "Lists the paths to the specified product. A path is how the user has access to a specified product, and is
   necessary when provisioning a product. A path also determines the constraints put on the product.

  request - `com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest`

  returns: Result of the ListLaunchPaths operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest request]
    (-> this (.listLaunchPaths request))))

(defn list-service-actions
  "Lists all self-service actions.

  request - `com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest`

  returns: Result of the ListServiceActions operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListServiceActionsResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListServiceActionsResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest request]
    (-> this (.listServiceActions request))))

(defn delete-provisioning-artifact
  "Deletes the specified provisioning artifact (also known as a version) for the specified product.


   You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete
   the last provisioning artifact for a product, because a product must have at least one provisioning artifact.

  request - `com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest`

  returns: Result of the DeleteProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest request]
    (-> this (.deleteProvisioningArtifact request))))

(defn list-portfolios
  "Lists all portfolios in the catalog.

  request - `com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest`

  returns: Result of the ListPortfolios operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPortfoliosResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListPortfoliosResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest request]
    (-> this (.listPortfolios request))))

(defn batch-associate-service-action-with-provisioning-artifact
  "Associates multiple self-service actions with provisioning artifacts.

  request - `com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest`

  returns: Result of the BatchAssociateServiceActionWithProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest request]
    (-> this (.batchAssociateServiceActionWithProvisioningArtifact request))))

(defn update-service-action
  "Updates a self-service action.

  request - `com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest`

  returns: Result of the UpdateServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.UpdateServiceActionResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest request]
    (-> this (.updateServiceAction request))))

(defn delete-portfolio
  "Deletes the specified portfolio.


   You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or
   shared accounts.

  request - `com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest`

  returns: Result of the DeletePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeletePortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeletePortfolioResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest request]
    (-> this (.deletePortfolio request))))

(defn get-aws-organizations-access-status
  "Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master
   account in the organization.

  request - `com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest`

  returns: Result of the GetAWSOrganizationsAccessStatus operation returned by the service. - `com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest request]
    (-> this (.getAWSOrganizationsAccessStatus request))))

(defn describe-provisioned-product-plan
  "Gets information about the resource changes for the specified plan.

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest`

  returns: Result of the DescribeProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest request]
    (-> this (.describeProvisionedProductPlan request))))

(defn associate-tag-option-with-resource
  "Associate the specified TagOption with the specified portfolio or product.

  request - `com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest`

  returns: Result of the AssociateTagOptionWithResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest request]
    (-> this (.associateTagOptionWithResource request))))

(defn disassociate-principal-from-portfolio
  "Disassociates a previously associated principal ARN from a specified portfolio.

  request - `com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest`

  returns: Result of the DisassociatePrincipalFromPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest request]
    (-> this (.disassociatePrincipalFromPortfolio request))))

(defn associate-budget-with-resource
  "Associates the specified budget with the specified resource.

  request - `com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest`

  returns: Result of the AssociateBudgetWithResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest request]
    (-> this (.associateBudgetWithResource request))))

(defn provision-product
  "Provisions the specified product.


   A provisioned product is a resourced instance of a product. For example, provisioning a product based on a
   CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of
   this request using DescribeRecord.


   If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not
   include conflicted keys as tags, or this causes the error
   \"Parameter validation failed: Missing required parameter in Tags[N]:Value\".

  request - `com.amazonaws.services.servicecatalog.model.ProvisionProductRequest`

  returns: Result of the ProvisionProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ProvisionProductResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ProvisionProductResult [^AWSServiceCatalogClient this ^com.amazonaws.services.servicecatalog.model.ProvisionProductRequest request]
    (-> this (.provisionProduct request))))

