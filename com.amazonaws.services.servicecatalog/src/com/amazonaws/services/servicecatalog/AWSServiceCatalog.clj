(ns com.amazonaws.services.servicecatalog.AWSServiceCatalog
  "Interface for accessing AWS Service Catalog.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSServiceCatalog instead.


  AWS Service Catalog

  AWS Service Catalog enables organizations to create and manage
  catalogs of IT services that are approved for use on AWS. To get the most out of this documentation, you should be
  familiar with the terminology discussed in AWS Service Catalog
  Concepts."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicecatalog AWSServiceCatalog]))

(defn create-portfolio-share
  "Shares the specified portfolio with the specified account or organization node. Shares to an organization node
   can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to
   create a portfolio share to an organization node.

  create-portfolio-share-request - `com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest`

  returns: Result of the CreatePortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest create-portfolio-share-request]
    (-> this (.createPortfolioShare create-portfolio-share-request))))

(defn delete-provisioned-product-plan
  "Deletes the specified plan.

  delete-provisioned-product-plan-request - `com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest`

  returns: Result of the DeleteProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest delete-provisioned-product-plan-request]
    (-> this (.deleteProvisionedProductPlan delete-provisioned-product-plan-request))))

(defn disable-aws-organizations-access
  "Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but
   it will prevent you from creating new shares throughout your organization. Current shares will not be in sync
   with your organization structure if it changes after calling this API. This API can only be called by the master
   account in the organization.

  disable-aws-organizations-access-request - `com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest`

  returns: Result of the DisableAWSOrganizationsAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest disable-aws-organizations-access-request]
    (-> this (.disableAWSOrganizationsAccess disable-aws-organizations-access-request))))

(defn list-tag-options
  "Lists the specified TagOptions or all TagOptions.

  list-tag-options-request - `com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest`

  returns: Result of the ListTagOptions operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListTagOptionsResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.ListTagOptionsResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest list-tag-options-request]
    (-> this (.listTagOptions list-tag-options-request))))

(defn delete-service-action
  "Deletes a self-service action.

  delete-service-action-request - `com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest`

  returns: Result of the DeleteServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeleteServiceActionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest delete-service-action-request]
    (-> this (.deleteServiceAction delete-service-action-request))))

(defn list-resources-for-tag-option
  "Lists the resources associated with the specified TagOption.

  list-resources-for-tag-option-request - `com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest`

  returns: Result of the ListResourcesForTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest list-resources-for-tag-option-request]
    (-> this (.listResourcesForTagOption list-resources-for-tag-option-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSServiceCatalog this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-constraint
  "Creates a constraint.

  create-constraint-request - `com.amazonaws.services.servicecatalog.model.CreateConstraintRequest`

  returns: Result of the CreateConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateConstraintResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.CreateConstraintResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateConstraintRequest create-constraint-request]
    (-> this (.createConstraint create-constraint-request))))

(defn delete-tag-option
  "Deletes the specified TagOption.


   You cannot delete a TagOption if it is associated with a product or portfolio.

  delete-tag-option-request - `com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest`

  returns: Result of the DeleteTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest delete-tag-option-request]
    (-> this (.deleteTagOption delete-tag-option-request))))

(defn enable-aws-organizations-access
  "Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive
   updates on your organization in order to sync your shares with the current structure. This API can only be called
   by the master account in the organization.


   By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so
   that your shares can be in sync with any changes in your AWS Organizations structure.

  enable-aws-organizations-access-request - `com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest`

  returns: Result of the EnableAWSOrganizationsAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest enable-aws-organizations-access-request]
    (-> this (.enableAWSOrganizationsAccess enable-aws-organizations-access-request))))

(defn describe-portfolio
  "Gets information about the specified portfolio.

  describe-portfolio-request - `com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest`

  returns: Result of the DescribePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribePortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribePortfolioResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest describe-portfolio-request]
    (-> this (.describePortfolio describe-portfolio-request))))

(defn delete-product
  "Deletes the specified product.


   You cannot delete a product if it was shared with you or is associated with a portfolio.

  delete-product-request - `com.amazonaws.services.servicecatalog.model.DeleteProductRequest`

  returns: Result of the DeleteProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeleteProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteProductRequest delete-product-request]
    (-> this (.deleteProduct delete-product-request))))

(defn search-products
  "Gets information about the products to which the caller has access.

  search-products-request - `com.amazonaws.services.servicecatalog.model.SearchProductsRequest`

  returns: Result of the SearchProducts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.SearchProductsResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.SearchProductsResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.SearchProductsRequest search-products-request]
    (-> this (.searchProducts search-products-request))))

(defn describe-portfolio-share-status
  "Gets the status of the specified portfolio share operation. This API can only be called by the master account in
   the organization.

  describe-portfolio-share-status-request - `com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest`

  returns: Result of the DescribePortfolioShareStatus operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest describe-portfolio-share-status-request]
    (-> this (.describePortfolioShareStatus describe-portfolio-share-status-request))))

(defn batch-disassociate-service-action-from-provisioning-artifact
  "Disassociates a batch of self-service actions from the specified provisioning artifact.

  batch-disassociate-service-action-from-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest`

  returns: Result of the BatchDisassociateServiceActionFromProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest batch-disassociate-service-action-from-provisioning-artifact-request]
    (-> this (.batchDisassociateServiceActionFromProvisioningArtifact batch-disassociate-service-action-from-provisioning-artifact-request))))

(defn disassociate-service-action-from-provisioning-artifact
  "Disassociates the specified self-service action association from the specified provisioning artifact.

  disassociate-service-action-from-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest`

  returns: Result of the DisassociateServiceActionFromProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest disassociate-service-action-from-provisioning-artifact-request]
    (-> this (.disassociateServiceActionFromProvisioningArtifact disassociate-service-action-from-provisioning-artifact-request))))

(defn reject-portfolio-share
  "Rejects an offer to share the specified portfolio.

  reject-portfolio-share-request - `com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest`

  returns: Result of the RejectPortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest reject-portfolio-share-request]
    (-> this (.rejectPortfolioShare reject-portfolio-share-request))))

(defn associate-principal-with-portfolio
  "Associates the specified principal ARN with the specified portfolio.

  associate-principal-with-portfolio-request - `com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest`

  returns: Result of the AssociatePrincipalWithPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest associate-principal-with-portfolio-request]
    (-> this (.associatePrincipalWithPortfolio associate-principal-with-portfolio-request))))

(defn list-provisioning-artifacts
  "Lists all provisioning artifacts (also known as versions) for the specified product.

  list-provisioning-artifacts-request - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest`

  returns: Result of the ListProvisioningArtifacts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest list-provisioning-artifacts-request]
    (-> this (.listProvisioningArtifacts list-provisioning-artifacts-request))))

(defn describe-tag-option
  "Gets information about the specified TagOption.

  describe-tag-option-request - `com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest`

  returns: Result of the DescribeTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest describe-tag-option-request]
    (-> this (.describeTagOption describe-tag-option-request))))

(defn associate-product-with-portfolio
  "Associates the specified product with the specified portfolio.

  associate-product-with-portfolio-request - `com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest`

  returns: Result of the AssociateProductWithPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest associate-product-with-portfolio-request]
    (-> this (.associateProductWithPortfolio associate-product-with-portfolio-request))))

(defn update-constraint
  "Updates the specified constraint.

  update-constraint-request - `com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest`

  returns: Result of the UpdateConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateConstraintResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.UpdateConstraintResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest update-constraint-request]
    (-> this (.updateConstraint update-constraint-request))))

(defn list-accepted-portfolio-shares
  "Lists all portfolios for which sharing was accepted by this account.

  list-accepted-portfolio-shares-request - `com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest`

  returns: Result of the ListAcceptedPortfolioShares operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest list-accepted-portfolio-shares-request]
    (-> this (.listAcceptedPortfolioShares list-accepted-portfolio-shares-request))))

(defn describe-provisioning-artifact
  "Gets information about the specified provisioning artifact (also known as a version) for the specified product.

  describe-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest`

  returns: Result of the DescribeProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest describe-provisioning-artifact-request]
    (-> this (.describeProvisioningArtifact describe-provisioning-artifact-request))))

(defn create-portfolio
  "Creates a portfolio.

  create-portfolio-request - `com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest`

  returns: Result of the CreatePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreatePortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.CreatePortfolioResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest create-portfolio-request]
    (-> this (.createPortfolio create-portfolio-request))))

(defn describe-product-view
  "Gets information about the specified product.

  describe-product-view-request - `com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest`

  returns: Result of the DescribeProductView operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProductViewResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProductViewResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest describe-product-view-request]
    (-> this (.describeProductView describe-product-view-request))))

(defn terminate-provisioned-product
  "Terminates the specified provisioned product.


   This operation does not delete any records associated with the provisioned product.


   You can check the status of this request using DescribeRecord.

  terminate-provisioned-product-request - `com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest`

  returns: Result of the TerminateProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest terminate-provisioned-product-request]
    (-> this (.terminateProvisionedProduct terminate-provisioned-product-request))))

(defn execute-provisioned-product-plan
  "Provisions or modifies a product based on the resource changes for the specified plan.

  execute-provisioned-product-plan-request - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest`

  returns: Result of the ExecuteProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest execute-provisioned-product-plan-request]
    (-> this (.executeProvisionedProductPlan execute-provisioned-product-plan-request))))

(defn list-provisioning-artifacts-for-service-action
  "Lists all provisioning artifacts (also known as versions) for the specified self-service action.

  list-provisioning-artifacts-for-service-action-request - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest`

  returns: Result of the ListProvisioningArtifactsForServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest list-provisioning-artifacts-for-service-action-request]
    (-> this (.listProvisioningArtifactsForServiceAction list-provisioning-artifacts-for-service-action-request))))

(defn create-provisioned-product-plan
  "Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified
   (when updating a provisioned product) when the plan is executed.


   You can create one plan per provisioned product. To create a plan for an existing provisioned product, the
   product status must be AVAILBLE or TAINTED.


   To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify
   the provisioned product, use ExecuteProvisionedProductPlan.

  create-provisioned-product-plan-request - `com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest`

  returns: Result of the CreateProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest create-provisioned-product-plan-request]
    (-> this (.createProvisionedProductPlan create-provisioned-product-plan-request))))

(defn accept-portfolio-share
  "Accepts an offer to share the specified portfolio.

  accept-portfolio-share-request - `com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest`

  returns: Result of the AcceptPortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest accept-portfolio-share-request]
    (-> this (.acceptPortfolioShare accept-portfolio-share-request))))

(defn update-provisioned-product
  "Requests updates to the configuration of the specified provisioned product.


   If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates
   requested, this operation can update with no interruption, with some interruption, or replace the provisioned
   product entirely.


   You can check the status of this request using DescribeRecord.

  update-provisioned-product-request - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest`

  returns: Result of the UpdateProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest update-provisioned-product-request]
    (-> this (.updateProvisionedProduct update-provisioned-product-request))))

(defn update-portfolio
  "Updates the specified portfolio.


   You cannot update a product that was shared with you.

  update-portfolio-request - `com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest`

  returns: Result of the UpdatePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest update-portfolio-request]
    (-> this (.updatePortfolio update-portfolio-request))))

(defn update-provisioning-artifact
  "Updates the specified provisioning artifact (also known as a version) for the specified product.


   You cannot update a provisioning artifact for a product that was shared with you.

  update-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest`

  returns: Result of the UpdateProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest update-provisioning-artifact-request]
    (-> this (.updateProvisioningArtifact update-provisioning-artifact-request))))

(defn disassociate-budget-from-resource
  "Disassociates the specified budget from the specified resource.

  disassociate-budget-from-resource-request - `com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest`

  returns: Result of the DisassociateBudgetFromResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest disassociate-budget-from-resource-request]
    (-> this (.disassociateBudgetFromResource disassociate-budget-from-resource-request))))

(defn describe-product
  "Gets information about the specified product.

  describe-product-request - `com.amazonaws.services.servicecatalog.model.DescribeProductRequest`

  returns: Result of the DescribeProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProductRequest describe-product-request]
    (-> this (.describeProduct describe-product-request))))

(defn update-provisioned-product-properties
  "Requests updates to the properties of the specified provisioned product.

  update-provisioned-product-properties-request - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest`

  returns: Result of the UpdateProvisionedProductProperties operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest update-provisioned-product-properties-request]
    (-> this (.updateProvisionedProductProperties update-provisioned-product-properties-request))))

(defn describe-copy-product-status
  "Gets the status of the specified copy product operation.

  describe-copy-product-status-request - `com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest`

  returns: Result of the DescribeCopyProductStatus operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest describe-copy-product-status-request]
    (-> this (.describeCopyProductStatus describe-copy-product-status-request))))

(defn create-tag-option
  "Creates a TagOption.

  create-tag-option-request - `com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest`

  returns: Result of the CreateTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateTagOptionResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.CreateTagOptionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest create-tag-option-request]
    (-> this (.createTagOption create-tag-option-request))))

(defn create-provisioning-artifact
  "Creates a provisioning artifact (also known as a version) for the specified product.


   You cannot create a provisioning artifact for a product that was shared with you.

  create-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest`

  returns: Result of the CreateProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest create-provisioning-artifact-request]
    (-> this (.createProvisioningArtifact create-provisioning-artifact-request))))

(defn describe-provisioning-parameters
  "Gets information about the configuration required to provision the specified product using the specified
   provisioning artifact.


   If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key.
   The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to
   ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error
   \"Parameter validation failed: Missing required parameter in Tags[N]:Value\". Tag the provisioned
   product with the value sc-tagoption-conflict-portfolioId-productId.

  describe-provisioning-parameters-request - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest`

  returns: Result of the DescribeProvisioningParameters operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest describe-provisioning-parameters-request]
    (-> this (.describeProvisioningParameters describe-provisioning-parameters-request))))

(defn list-constraints-for-portfolio
  "Lists the constraints for the specified portfolio and product.

  list-constraints-for-portfolio-request - `com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest`

  returns: Result of the ListConstraintsForPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest list-constraints-for-portfolio-request]
    (-> this (.listConstraintsForPortfolio list-constraints-for-portfolio-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSServiceCatalog this]
    (-> this (.shutdown))))

(defn list-provisioned-product-plans
  "Lists the plans for the specified provisioned product or all plans to which the user has access.

  list-provisioned-product-plans-request - `com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest`

  returns: Result of the ListProvisionedProductPlans operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest list-provisioned-product-plans-request]
    (-> this (.listProvisionedProductPlans list-provisioned-product-plans-request))))

(defn associate-service-action-with-provisioning-artifact
  "Associates a self-service action with a provisioning artifact.

  associate-service-action-with-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest`

  returns: Result of the AssociateServiceActionWithProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest associate-service-action-with-provisioning-artifact-request]
    (-> this (.associateServiceActionWithProvisioningArtifact associate-service-action-with-provisioning-artifact-request))))

(defn list-portfolio-access
  "Lists the account IDs that have access to the specified portfolio.

  list-portfolio-access-request - `com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest`

  returns: Result of the ListPortfolioAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest list-portfolio-access-request]
    (-> this (.listPortfolioAccess list-portfolio-access-request))))

(defn search-products-as-admin
  "Gets information about the products for the specified portfolio or all products.

  search-products-as-admin-request - `com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest`

  returns: Result of the SearchProductsAsAdmin operation returned by the service. - `com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest search-products-as-admin-request]
    (-> this (.searchProductsAsAdmin search-products-as-admin-request))))

(defn disassociate-product-from-portfolio
  "Disassociates the specified product from the specified portfolio.

  disassociate-product-from-portfolio-request - `com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest`

  returns: Result of the DisassociateProductFromPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest disassociate-product-from-portfolio-request]
    (-> this (.disassociateProductFromPortfolio disassociate-product-from-portfolio-request))))

(defn update-product
  "Updates the specified product.

  update-product-request - `com.amazonaws.services.servicecatalog.model.UpdateProductRequest`

  returns: Result of the UpdateProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.UpdateProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateProductRequest update-product-request]
    (-> this (.updateProduct update-product-request))))

(defn describe-service-action
  "Describes a self-service action.

  describe-service-action-request - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest`

  returns: Result of the DescribeServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeServiceActionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest describe-service-action-request]
    (-> this (.describeServiceAction describe-service-action-request))))

(defn scan-provisioned-products
  "Lists the provisioned products that are available (not terminated).


   To use additional filtering, see SearchProvisionedProducts.

  scan-provisioned-products-request - `com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest`

  returns: Result of the ScanProvisionedProducts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest scan-provisioned-products-request]
    (-> this (.scanProvisionedProducts scan-provisioned-products-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"servicecatalog.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"servicecatalog.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSServiceCatalog this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-constraint
  "Gets information about the specified constraint.

  describe-constraint-request - `com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest`

  returns: Result of the DescribeConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeConstraintResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeConstraintResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest describe-constraint-request]
    (-> this (.describeConstraint describe-constraint-request))))

(defn describe-provisioned-product
  "Gets information about the specified provisioned product.

  describe-provisioned-product-request - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest`

  returns: Result of the DescribeProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest describe-provisioned-product-request]
    (-> this (.describeProvisionedProduct describe-provisioned-product-request))))

(defn update-tag-option
  "Updates the specified TagOption.

  update-tag-option-request - `com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest`

  returns: Result of the UpdateTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest update-tag-option-request]
    (-> this (.updateTagOption update-tag-option-request))))

(defn list-principals-for-portfolio
  "Lists all principal ARNs associated with the specified portfolio.

  list-principals-for-portfolio-request - `com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest`

  returns: Result of the ListPrincipalsForPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest list-principals-for-portfolio-request]
    (-> this (.listPrincipalsForPortfolio list-principals-for-portfolio-request))))

(defn delete-constraint
  "Deletes the specified constraint.

  delete-constraint-request - `com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest`

  returns: Result of the DeleteConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteConstraintResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeleteConstraintResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest delete-constraint-request]
    (-> this (.deleteConstraint delete-constraint-request))))

(defn execute-provisioned-product-service-action
  "Executes a self-service action against a provisioned product.

  execute-provisioned-product-service-action-request - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest`

  returns: Result of the ExecuteProvisionedProductServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest execute-provisioned-product-service-action-request]
    (-> this (.executeProvisionedProductServiceAction execute-provisioned-product-service-action-request))))

(defn create-product
  "Creates a product.

  create-product-request - `com.amazonaws.services.servicecatalog.model.CreateProductRequest`

  returns: Result of the CreateProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateProductResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.CreateProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateProductRequest create-product-request]
    (-> this (.createProduct create-product-request))))

(defn list-record-history
  "Lists the specified requests or all performed requests.

  list-record-history-request - `com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest`

  returns: Result of the ListRecordHistory operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest list-record-history-request]
    (-> this (.listRecordHistory list-record-history-request))))

(defn list-budgets-for-resource
  "Lists all the budgets associated to the specified resource.

  list-budgets-for-resource-request - `com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest`

  returns: Result of the ListBudgetsForResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest list-budgets-for-resource-request]
    (-> this (.listBudgetsForResource list-budgets-for-resource-request))))

(defn copy-product
  "Copies the specified source product to the specified target product or a new product.


   You can copy a product to the same account or another account. You can copy a product to the same region or
   another region.


   This operation is performed asynchronously. To track the progress of the operation, use
   DescribeCopyProductStatus.

  copy-product-request - `com.amazonaws.services.servicecatalog.model.CopyProductRequest`

  returns: Result of the CopyProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CopyProductResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.CopyProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CopyProductRequest copy-product-request]
    (-> this (.copyProduct copy-product-request))))

(defn list-service-actions-for-provisioning-artifact
  "Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning
   Artifact ID.

  list-service-actions-for-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest`

  returns: Result of the ListServiceActionsForProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest list-service-actions-for-provisioning-artifact-request]
    (-> this (.listServiceActionsForProvisioningArtifact list-service-actions-for-provisioning-artifact-request))))

(defn describe-product-as-admin
  "Gets information about the specified product. This operation is run with administrator access.

  describe-product-as-admin-request - `com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest`

  returns: Result of the DescribeProductAsAdmin operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest describe-product-as-admin-request]
    (-> this (.describeProductAsAdmin describe-product-as-admin-request))))

(defn disassociate-tag-option-from-resource
  "Disassociates the specified TagOption from the specified resource.

  disassociate-tag-option-from-resource-request - `com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest`

  returns: Result of the DisassociateTagOptionFromResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest disassociate-tag-option-from-resource-request]
    (-> this (.disassociateTagOptionFromResource disassociate-tag-option-from-resource-request))))

(defn describe-record
  "Gets information about the specified request operation.


   Use this operation after calling a request operation (for example, ProvisionProduct,
   TerminateProvisionedProduct, or UpdateProvisionedProduct).



   If a provisioned product was transferred to a new owner using UpdateProvisionedProductProperties, the new
   owner will be able to describe all past records for that product. The previous owner will no longer be able to
   describe the records, but will be able to use ListRecordHistory to see the product's history from when he
   was the owner.

  describe-record-request - `com.amazonaws.services.servicecatalog.model.DescribeRecordRequest`

  returns: Result of the DescribeRecord operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeRecordResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeRecordResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeRecordRequest describe-record-request]
    (-> this (.describeRecord describe-record-request))))

(defn delete-portfolio-share
  "Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization
   node can only be deleted by the master account of an Organization.

  delete-portfolio-share-request - `com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest`

  returns: Result of the DeletePortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest delete-portfolio-share-request]
    (-> this (.deletePortfolioShare delete-portfolio-share-request))))

(defn search-provisioned-products
  "Gets information about the provisioned products that meet the specified criteria.

  search-provisioned-products-request - `com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest`

  returns: Result of the SearchProvisionedProducts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest search-provisioned-products-request]
    (-> this (.searchProvisionedProducts search-provisioned-products-request))))

(defn list-organization-portfolio-access
  "Lists the organization nodes that have access to the specified portfolio. This API can only be called by the
   master account in the organization.

  list-organization-portfolio-access-request - `com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest`

  returns: Result of the ListOrganizationPortfolioAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest list-organization-portfolio-access-request]
    (-> this (.listOrganizationPortfolioAccess list-organization-portfolio-access-request))))

(defn describe-service-action-execution-parameters
  "describe-service-action-execution-parameters-request - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest`

  returns: Result of the DescribeServiceActionExecutionParameters operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest describe-service-action-execution-parameters-request]
    (-> this (.describeServiceActionExecutionParameters describe-service-action-execution-parameters-request))))

(defn create-service-action
  "Creates a self-service action.

  create-service-action-request - `com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest`

  returns: Result of the CreateServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.CreateServiceActionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest create-service-action-request]
    (-> this (.createServiceAction create-service-action-request))))

(defn list-portfolios-for-product
  "Lists all portfolios that the specified product is associated with.

  list-portfolios-for-product-request - `com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest`

  returns: Result of the ListPortfoliosForProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest list-portfolios-for-product-request]
    (-> this (.listPortfoliosForProduct list-portfolios-for-product-request))))

(defn list-stack-instances-for-provisioned-product
  "Returns summary information about stack instances that are associated with the specified
   CFN_STACKSET type provisioned product. You can filter for stack instances that are associated with a
   specific AWS account name or region.

  list-stack-instances-for-provisioned-product-request - `com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest`

  returns: Result of the ListStackInstancesForProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest list-stack-instances-for-provisioned-product-request]
    (-> this (.listStackInstancesForProvisionedProduct list-stack-instances-for-provisioned-product-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSServiceCatalog this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-launch-paths
  "Lists the paths to the specified product. A path is how the user has access to a specified product, and is
   necessary when provisioning a product. A path also determines the constraints put on the product.

  list-launch-paths-request - `com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest`

  returns: Result of the ListLaunchPaths operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest list-launch-paths-request]
    (-> this (.listLaunchPaths list-launch-paths-request))))

(defn list-service-actions
  "Lists all self-service actions.

  list-service-actions-request - `com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest`

  returns: Result of the ListServiceActions operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListServiceActionsResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListServiceActionsResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest list-service-actions-request]
    (-> this (.listServiceActions list-service-actions-request))))

(defn delete-provisioning-artifact
  "Deletes the specified provisioning artifact (also known as a version) for the specified product.


   You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete
   the last provisioning artifact for a product, because a product must have at least one provisioning artifact.

  delete-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest`

  returns: Result of the DeleteProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest delete-provisioning-artifact-request]
    (-> this (.deleteProvisioningArtifact delete-provisioning-artifact-request))))

(defn list-portfolios
  "Lists all portfolios in the catalog.

  list-portfolios-request - `com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest`

  returns: Result of the ListPortfolios operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPortfoliosResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ListPortfoliosResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest list-portfolios-request]
    (-> this (.listPortfolios list-portfolios-request))))

(defn batch-associate-service-action-with-provisioning-artifact
  "Associates multiple self-service actions with provisioning artifacts.

  batch-associate-service-action-with-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest`

  returns: Result of the BatchAssociateServiceActionWithProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest batch-associate-service-action-with-provisioning-artifact-request]
    (-> this (.batchAssociateServiceActionWithProvisioningArtifact batch-associate-service-action-with-provisioning-artifact-request))))

(defn update-service-action
  "Updates a self-service action.

  update-service-action-request - `com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest`

  returns: Result of the UpdateServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateServiceActionResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.UpdateServiceActionResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest update-service-action-request]
    (-> this (.updateServiceAction update-service-action-request))))

(defn delete-portfolio
  "Deletes the specified portfolio.


   You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or
   shared accounts.

  delete-portfolio-request - `com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest`

  returns: Result of the DeletePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeletePortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DeletePortfolioResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest delete-portfolio-request]
    (-> this (.deletePortfolio delete-portfolio-request))))

(defn get-aws-organizations-access-status
  "Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master
   account in the organization.

  get-aws-organizations-access-status-request - `com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest`

  returns: Result of the GetAWSOrganizationsAccessStatus operation returned by the service. - `com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest get-aws-organizations-access-status-request]
    (-> this (.getAWSOrganizationsAccessStatus get-aws-organizations-access-status-request))))

(defn describe-provisioned-product-plan
  "Gets information about the resource changes for the specified plan.

  describe-provisioned-product-plan-request - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest`

  returns: Result of the DescribeProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult`

  throws: com.amazonaws.services.servicecatalog.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest describe-provisioned-product-plan-request]
    (-> this (.describeProvisionedProductPlan describe-provisioned-product-plan-request))))

(defn associate-tag-option-with-resource
  "Associate the specified TagOption with the specified portfolio or product.

  associate-tag-option-with-resource-request - `com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest`

  returns: Result of the AssociateTagOptionWithResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult`

  throws: com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException - An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this account. Please use the AWS console to perform the migration process before retrying the operation."
  (^com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest associate-tag-option-with-resource-request]
    (-> this (.associateTagOptionWithResource associate-tag-option-with-resource-request))))

(defn disassociate-principal-from-portfolio
  "Disassociates a previously associated principal ARN from a specified portfolio.

  disassociate-principal-from-portfolio-request - `com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest`

  returns: Result of the DisassociatePrincipalFromPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest disassociate-principal-from-portfolio-request]
    (-> this (.disassociatePrincipalFromPortfolio disassociate-principal-from-portfolio-request))))

(defn associate-budget-with-resource
  "Associates the specified budget with the specified resource.

  associate-budget-with-resource-request - `com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest`

  returns: Result of the AssociateBudgetWithResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest associate-budget-with-resource-request]
    (-> this (.associateBudgetWithResource associate-budget-with-resource-request))))

(defn provision-product
  "Provisions the specified product.


   A provisioned product is a resourced instance of a product. For example, provisioning a product based on a
   CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of
   this request using DescribeRecord.


   If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not
   include conflicted keys as tags, or this causes the error
   \"Parameter validation failed: Missing required parameter in Tags[N]:Value\".

  provision-product-request - `com.amazonaws.services.servicecatalog.model.ProvisionProductRequest`

  returns: Result of the ProvisionProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ProvisionProductResult`

  throws: com.amazonaws.services.servicecatalog.model.InvalidParametersException - One or more parameters provided to the operation are not valid."
  (^com.amazonaws.services.servicecatalog.model.ProvisionProductResult [^AWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ProvisionProductRequest provision-product-request]
    (-> this (.provisionProduct provision-product-request))))

