import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FMGE {
    public static void main(String[] args)throws FileNotFoundException, IOException {

//        FileReader file = new FileReader("C:\\Users\\jimmy\\Downloads\\FMGE_150_MCQs.txt");
        String filePath = "C:\\Users\\jimmy\\Downloads\\FMGE_150_MCQs.txt";

            String sr = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);

String[] arr = {
        "C", // 1. Inferior thyroid artery is not a branch of the external carotid artery.
        "B", // 2. Glucagon is responsible for increasing blood glucose levels.
        "B", // 3. The end product of purine metabolism in humans is uric acid.
        "A", // 4. Atropine is used in the treatment of organophosphate poisoning.
        "C", // 5. Human immunodeficiency virus is an RNA virus.
        "B", // 6. A granuloma is most commonly associated with chronic inflammation.
        "A", // 7. The drug of choice for an acute asthma attack is salbutamol.
        "A", // 8. Trousseau's sign is a sign of hypocalcemia.
        "A", // 9. The most common cause of postpartum hemorrhage is uterine atony.
        "B", // 10. The first-line treatment for Kawasaki disease is intravenous immunoglobulin (IVIG).
        "B", // 11. The phrenic nerve innervates the diaphragm.
        "B", // 12. Glucagon is responsible for increasing blood glucose levels.
        "B", // 13. The end product of purine metabolism in humans is uric acid.
        "B", // 14. The antidote for acetaminophen poisoning is N-acetylcysteine.
        "A", // 15. The causative agent of Lyme disease is Borrelia burgdorferi.
        "A", // 16. The characteristic cell found in Hodgkin's lymphoma is the Reed-Sternberg cell.
        "A", // 17. The drug of choice for an acute asthma attack is salbutamol.
        "A", // 18. Trousseau's sign is a sign of hypocalcemia.
        "A", // 19. The most common cause of postpartum hemorrhage is uterine atony.
        "B", // 20. A sunken fontanelle is a sign of dehydration in an infant.
        "B", // 21. The phrenic nerve innervates the diaphragm.
        "B", // 22. Glucagon is responsible for increasing blood glucose levels.
        "B", // 23. The end product of purine metabolism in humans is uric acid.
        "A", // 24. Atropine is used in the treatment of organophosphate poisoning.
        "B", // 25. Staphylococcus aureus is a gram-positive bacterium.
        "B", // 26. A granuloma is most commonly associated with chronic inflammation.
        "C", // 27. Troponin T is used in the diagnosis of myocardial infarction.
        "A", // 28. The most common cause of acute pancreatitis is gallstones.
        "C", // 29. The most common site for ectopic pregnancy is the fallopian tube.
        "B", // 30. The most common cause of bronchiolitis in infants is respiratory syncytial virus (RSV).
        "C", // 31. Inferior thyroid artery is not a branch of the external carotid artery.
        "B", // 32. The pacemaker of the heart is the sinoatrial node.
        "B", // 33. The end product of purine metabolism in humans is uric acid.
        "B", // 34. The antidote for acetaminophen poisoning is N-acetylcysteine.
        "A", // 35. The causative agent of Lyme disease is Borrelia burgdorferi.
        "B", // 36. TP53 is a tumor suppressor gene.
        "A", // 37. The drug of choice for an acute asthma attack is salbutamol.
        "C", // 38. The preferred imaging modality for acute appendicitis is CT scan.
        "C", // 39. Breast cancer is an absolute contraindication to oral contraceptive pills.
        "B", // 40. The most common cause of bronchiolitis in infants is respiratory syncytial virus (RSV).
        "C", // 41. Teres major is not a rotator cuff muscle.
        "B", // 42. The pacemaker of the heart is the sinoatrial node.
        "C", // 43. Vitamin K is a cofactor in carboxylation reactions.
        "A", // 44. Atropine is used in the treatment of organophosphate poisoning.
        "A", // 45. The causative agent of Lyme disease is Borrelia burgdorferi.
        "B", // 46. TP53 is a tumor suppressor gene.
        "C", // 47. Troponin T is used in the diagnosis of myocardial infarction.
        "A", // 48. The most common cause of acute pancreatitis is gallstones.
        "A", // 49. The most common cause of postpartum hemorrhage is uterine atony.
        "B", // 50. A sunken fontanelle is a sign of dehydration in an infant.
        "C", // 51. Inferior thyroid artery is not a branch of the external carotid artery.
        "B", // 52. The pacemaker of the heart is the sinoatrial node.
        "B", // 53. The end product of purine metabolism in humans is uric acid.
        "B", // 54. The antidote for acetaminophen poisoning is N-acetylcysteine.
        "B", // 55. Staphylococcus aureus is a gram-positive bacterium.
        "A", // 56. The characteristic cell found in Hodgkin's lymphoma is the Reed-Sternberg cell.
        "C", // 57. Troponin T is used in the diagnosis of myocardial infarction.
        "C", // 58. The preferred imaging modality for acute appendicitis is CT scan.
        "C", // 59. Breast cancer is an absolute contraindication to oral contraceptive pills.
        "B", // 60. A sunken fontanelle is a sign of dehydration in an infant.
        "B", // 61. The phrenic nerve innervates the diaphragm.
        "B", // 62. Glucagon is responsible for increasing blood glucose levels.
        "B", // 63. Phenylalanine hydroxylase is deficient in Phenylketonuria (PKU).
        "A", // 64. Atropine is used in the treatment of organophosphate poisoning.
        "C", // 65. Human immunodeficiency virus is an RNA virus.
        "B", // 66. TP53 is a tumor suppressor gene.
        "B", // 67. Proteinuria is a feature of nephrotic syndrome.
        "C", // 68. The preferred imaging modality for acute appendicitis is CT scan.
        "C", // 69. The most common site for ectopic pregnancy is the fallopian tube.
        "B", // 70. A sunken fontanelle is a sign of dehydration in an infant.
        "C", // 71. Inferior thyroid artery is not a branch of the external carotid artery.
        "B", // 72. Glucagon is responsible for increasing blood glucose levels.
        "C", // 73. Vitamin K is a cofactor in carboxylation reactions.
        "A", // 74. Atenolol is a beta-blocker.
        "C", // 75. Human immunodeficiency virus is an RNA virus.
        "B", // 76. TP53 is a tumor suppressor gene.
        "C", // 77. Troponin T is used in the diagnosis of myocardial infarction.
        "A", // 78. The most common cause of acute pancreatitis is gallstones.
        "C", // 79. Breast cancer is an absolute contraindication to oral contraceptive pills.
        "B", // 80. The first-line treatment for Kawasaki disease is intravenous immunoglobulin (IVIG).
        "C", // 81. Teres major is not a rotator cuff muscle.
        "B", // 82. Glucagon is responsible for increasing blood glucose levels.
        "B", // 83. Phenylalanine hydroxylase is deficient in Phenylketonuria (PKU).
        "B", // 84. The antidote for acetaminophen poisoning is N-acetylcysteine.
        "B", // 85. Staphylococcus aureus is a gram-positive bacterium.
        "B", // 86. A granuloma is most commonly associated with chronic inflammation.
        "B", // 87. Proteinuria is a feature of nephrotic syndrome.
        "A", // 88. The most common cause of acute pancreatitis is gallstones.
        "A", // 89. The most common cause of postpartum hemorrhage is uterine atony.
        "B", // 90. The most common cause of bronchiolitis in infants is respiratory syncytial virus (RSV).
        "C", // 91. Inferior thyroid artery is not a branch of the external carotid artery.
        "B", // 92. Glucagon is responsible for increasing blood glucose levels.
        "B", // 93. Phenylalanine hydroxylase is deficient in Phenylketonuria (PKU).
        "A", // 94. Atropine is used in the treatment of organophosphate poisoning.
        "C", // 95. Human immunodeficiency virus is an RNA virus.
        "B", // 96. TP53 is a tumor suppressor gene.
        "B", // 97. The pacemaker of the heart is the sinoatrial node.
        "A", // 98. The drug of choice for an acute asthma attack is salbutamol.
        "C", // 99. The most common site for ectopic pregnancy is the fallopian tube.
        "B", // 100. The first-line treatment for Kawasaki disease is intravenous immunoglobulin (IVIG).
        "A", // 101. Gastric ulcer pain typically occurs shortly after eating.
        "B", // 102. The causative agent of malaria is Plasmodium species.
        "B", // 103. The most common cause of neonatal sepsis is Group B Streptococcus.
        "A", // 104. The major neurotransmitter in the sympathetic nervous system is norepinephrine.
        "C", // 105. The most common cause of hyperthyroidism is Graves' disease.
        "B", // 106. The classic triad of ectopic pregnancy includes abdominal pain, amenorrhea, and vaginal bleeding.
        "B", // 107. The drug of choice for the treatment of bipolar disorder is lithium.
        "C", // 108. Wilson's disease is characterized by excessive deposition of copper in tissues.
        "B", // 109. The first line treatment for anaphylaxis is epinephrine.
        "C", // 110. Sarcoidosis is characterized by non-caseating granulomas.
        "B", // 111. The causative agent of syphilis is Treponema pallidum.
        "B", // 112. The antidote for opioid overdose is naloxone.
        "C", // 113. The most common cause of Cushing's syndrome is exogenous corticosteroid use.
        "C", // 114. The preferred diagnostic test for pulmonary embolism is CT pulmonary angiography.
        "B", // 115. The most common cause of peptic ulcer disease is Helicobacter pylori infection.
        "C", // 116. The characteristic finding in nephrotic syndrome is proteinuria.
        "B", // 117. The major side effect of ACE inhibitors is a persistent dry cough.
        "C", // 118. The most common cause of chronic renal failure is diabetes mellitus.
        "A", // 119. The drug of choice for the treatment of status epilepticus is diazepam.
        "B", // 120. The most common cause of community-acquired pneumonia is Streptococcus pneumoniae.
        "B", // 121. The preferred imaging modality for diagnosing cholecystitis is ultrasound.
        "C", // 122. Turner syndrome is characterized by a 45, X karyotype.
        "B", // 123. The major site of erythropoiesis in adults is the bone marrow.
        "C", // 124. The most common cause of nephrotic syndrome in adults is focal segmental glomerulosclerosis (FSGS).
        "B", // 125. The characteristic feature of Parkinson's disease is bradykinesia.
        "C", // 126. The most common cause of hypothyroidism is Hashimoto's thyroiditis.
        "B", // 127. The most common type of lung cancer is adenocarcinoma.
        "C", // 128. The drug of choice for the treatment of acute gout is colchicine.
        "B", // 129. The most common cause of secondary hypertension is renal artery stenosis.
        "A", // 130. The major cause of portal hypertension is liver cirrhosis.
        "C", // 131. The characteristic finding in diabetic retinopathy is microaneurysms.
        "C", // 132. The preferred treatment for bacterial meningitis in adults is ceftriaxone.
        "B", // 133. The most common cause of hypercalcemia is primary hyperparathyroidism.
        "A", // 134. The major complication of deep vein thrombosis is pulmonary embolism.
        "B", // 135. The most common cause of death in patients with chronic kidney disease is cardiovascular disease.
        "C", // 136. The characteristic finding in amyotrophic lateral sclerosis (ALS) is upper and lower motor neuron involvement.
        "B", // 137. The major neurotransmitter involved in schizophrenia is dopamine.
        "A", // 138. The characteristic feature of osteoarthritis is joint space narrowing.
        "C", // 139. The preferred treatment for acute bacterial sinusitis is amoxicillin-clavulanate.
        "B", // 140. The most common cause of peripheral neuropathy is diabetes mellitus.
        "C", // 141. The characteristic finding in multiple myeloma is monoclonal protein spike.
        "B", // 142. The major side effect of amiodarone is pulmonary toxicity.
        "C", // 143. The most common cause of hepatocellular carcinoma is chronic hepatitis B and C infection.
        "A", // 144. The preferred treatment for Helicobacter pylori infection is a combination of a proton pump inhibitor and antibiotics.
        "C", // 145. The major cause of death in patients with amyotrophic lateral sclerosis (ALS) is respiratory failure.
        "B", // 146. The characteristic finding in Crohn's disease is transmural inflammation.
        "C", // 147. The preferred treatment for latent tuberculosis infection is isoniazid.
        "B", // 148. The major cause of Addison's disease is autoimmune adrenalitis.
        "A", // 149. The characteristic feature of rheumatoid arthritis is symmetric joint involvement.
        "C", // 150. The preferred diagnostic test for aortic dissection is CT angiography.

};
        String patternString = "(\\d+\\.\\s\\([A-Za-z\\s]+\\).+?)\\n\\s+A\\.(.+?)\\n\\s+B\\.(.+?)\\n\\s+C\\.(.+?)\\n\\s+D\\.(.+?)(?=\\n|$)";
        Pattern patterns = Pattern.compile(patternString, Pattern.DOTALL);
        Matcher matchers = patterns.matcher(sr);

        // HashMap to store the questions and options
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> questionsMap = new LinkedHashMap<>();
        int index = 0;
        while(matchers.find()){
            questionsMap.put(matchers.group(),arr[index]);
        index++;
        }
//        System.out.println(questionsMap);
        LinkedHashMap<String, String> wrongOnes = new LinkedHashMap<>();
        Iterator<String> iterator = questionsMap.keySet().iterator();
        int rightAns = 0;
        int c = 0;
        while(iterator.hasNext()){
           String s = iterator.next();
            System.out.println(s);
           String ans= scanner.next();
            if(questionsMap.get(s).equals(ans.toUpperCase())){
                rightAns++;
            }

            else{
                wrongOnes.put(s,questionsMap.get(s));
            }
            c++;
            System.out.println(rightAns);
        }
        System.out.println(rightAns);

//        wrongOnes.entrySet().forEach(x-> System.out.println(x));
        for(Map.Entry<String,String> maps : wrongOnes.entrySet()){
            System.out.println(maps.getKey());
            System.out.println(maps.getValue());
        }
//        System.out.println(questionsMap);

    }
}
